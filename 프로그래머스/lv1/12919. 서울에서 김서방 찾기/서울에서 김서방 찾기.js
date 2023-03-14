function solution(seoul) {
    let answer = '';
    let i = 0;
    while(true){
        if(seoul[i] == "Kim") {
            answer += "김서방은 "+i+"에 있다";
            break;
        }
        i++;
    }
    return answer;
}