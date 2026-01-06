def solution(my_string, index_list):
    result = []
    
    for i in index_list:
        result.append(my_string[i])
    return "".join(result)
