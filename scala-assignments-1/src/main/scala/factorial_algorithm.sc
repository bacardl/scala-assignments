def factorial(n: Int): Int =
	if (n == 0) 1 else n * factorial(n - 1)

factorial(4)
factorial(5)
factorial(6)