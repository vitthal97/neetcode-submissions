class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()) {
            return "";
        }

        StringBuilder encode = new StringBuilder();
        for(String str: strs) {
            encode.append(str.length()).append(",");
        }
        encode.append("#");
        for(String str: strs) {
            encode.append(str);
        }
        return encode.toString();

    }

    public List<String> decode(String str) {
        if(str.length()==0) {
            return new ArrayList<>();
        }
        char[] encodedCh = str.toCharArray();
        List<String> decoded = new ArrayList<>();
        int hashIndex = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='#') {
                hashIndex = i;
                break;
            }
        }
        String lenStr = str.substring(0, hashIndex);
        String[] lenArr = lenStr.split(",");
        int start = hashIndex+1;
        for(int i=0;i<lenArr.length;i++) {

            decoded.add(str.substring(start, start+Integer.parseInt(lenArr[i])));
            start = start + Integer.parseInt(lenArr[i]);
        }
        return decoded;
    }
}
