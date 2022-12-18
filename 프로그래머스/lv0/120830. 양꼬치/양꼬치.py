def solution(n, k):
    answer = n*12000
    if k > (n/10):
        answer += (k - n//10)*2000
    return answer