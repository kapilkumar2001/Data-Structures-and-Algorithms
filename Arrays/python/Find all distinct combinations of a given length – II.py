# Function to print all distinct combinations of length `k`
def findCombinations(A, k, subarrays, out=(), i=0):
 
    # do nothing for empty input
    if len(A) == 0:
        return
 
    # base case: combination size is `k`
    if k == 0:
        subarrays.add(out)
        return
 
    # return if no more elements are left
    if i == len(A):
        return
 
    # include the current element in the current combination and recur
    findCombinations(A, k - 1, subarrays, out + (A[i],), i + 1)
 
    # exclude the current element from the current combination and recur
    findCombinations(A, k, subarrays, out, i + 1)
 
 
if __name__ == '__main__':
 
    A = [1, 2, 3]
    k = 2
 
    # process elements from left to right
    subarrays = set()
    findCombinations(A, k, subarrays)
    print(subarrays)
 
