
import math

sn = []
global m
m = 0

# Function for generating
# the subsequences


def subsequences(s, op, i, j):

	# Base Case
	if(i == m):
		op[j] = None
		temp = "".join([i for i in op if i])

		# Insert each generated
		# subsequence into the set
		sn.append(temp)
		return

	# Recursive Case
	else:

		# When a particular
		# character is taken
		op[j] = s[i]

		subsequences(s, op,
					i + 1, j + 1)

		# When a particular
		# character isn't taken
		subsequences(s, op,
					i + 1, j)
		return


# Driver Code
str = "dd"
m = len(str)
n = int(math.pow(2, m) + 1)

# Output array for storing
# the generating subsequences
# in each call
op = [None for i in range(n)]

# Function Call
subsequences(str, op, 0, 0)

# Output will be the number
# of elements in the set
print(len(set(sn)))

