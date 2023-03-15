function solution(n) {
    let answer = [1];
    i = 2;
    while(i<=n){
        if(n%i === 0){
            answer.push(i);
        }
        i++;
    }
    return answer;
}