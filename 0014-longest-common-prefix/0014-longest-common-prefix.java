class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs[0].length(),i;
        int m = strs.length-1;
        for( i =0;i<n;i++){
            if(strs[0].charAt(i) !=strs[m].charAt(i))
            break;
        }
        return strs[0].substring(0,i);
    }
}