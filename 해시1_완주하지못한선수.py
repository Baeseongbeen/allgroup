def solution(participant, completion):
    score = {}
    comple = {}
    
    for i in participant:
        if i in score.keys():
            score[i] = score[i] + 1
        else:
            score[i] = 1
    
    for i in completion:
        if i in comple.keys():
            comple[i] = comple[i] + 1
        else:
            comple[i] = 1
        
    for i in score:
        if i not in comple:
            return i
        elif score[i] != comple[i]:
            return i