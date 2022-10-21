# Returns the total number of distinct absolute values in a given input
def findDistinctCount(input):
 
    s = set([abs(i) for i in input])
    return len(s)
 
 
if __name__ == '__main__':
 
    input = [-1, -1, 0, 1, 1, 1]
 
    print('The total number of distinct absolute values is', findDistinctCount(input))
