class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] sum = my_string.replaceAll("[a-zA-Z]", "").split("");
        for(int i = 0; i<sum.length; i++) {
            answer += Integer.parseInt(sum[i]);
        }
        return answer;
    }
}