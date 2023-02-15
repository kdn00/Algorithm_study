function solution(n) {
    var answer = 0;
    while(n>1){
        answer += parseInt(n%10);
        n /= 10;
    }
    return answer;
}