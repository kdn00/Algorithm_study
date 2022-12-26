import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        // 가장 큰 두 수를 곱해서 최댓값을 만들기 위해 정렬한다.
        Arrays.sort(numbers);     
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}