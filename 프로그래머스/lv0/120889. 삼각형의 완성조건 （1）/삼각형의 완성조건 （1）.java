// sort 함수를 쓰기 위해 import 시킨다.
import java.util.*;
class Solution {
    public int solution(int[] sides) {
        // 1. 가장 긴 변을 찾기 위해 정렬을 한다.
        Arrays.sort(sides);
        // 2. 삼항연산자를 사용해 조건을 검사한다.
        return sides[2] < (sides[0] + sides[1]) ? 1 : 2;
    }
}