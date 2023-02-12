function solution(num_list) {
    var answer = new Array(num_list.length);
    let index = 0;
    for(let i = num_list.length-1; i>=0; i--){
        answer[index] = num_list[i];
        index++;
    }
    return answer;
}