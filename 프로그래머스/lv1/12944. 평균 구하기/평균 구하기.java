class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int i;
        for(i = 0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer/i;
    }
}