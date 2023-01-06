class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] word = my_string.toCharArray();
        for(int i=0; i<word.length; i++){
            for(int j=0; j<n; j++){
                answer += word[i];
            }
        }    
        return answer;
    }
}