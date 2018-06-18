def is_prime(n):
	if n == 1:
		return False
	else:
		sqrt = int(n**0.5)
		for i in range(2, sqrt + 1):
            # Remainder is zero and not equal N -> not prime
			if ((n % i) == 0) and (i != n):
				return False
		return True


t = int(input())
for _ in range(t):
	n = int(input())
	if is_prime(n):
		print("Prime")
	else:
		print("Not prime")