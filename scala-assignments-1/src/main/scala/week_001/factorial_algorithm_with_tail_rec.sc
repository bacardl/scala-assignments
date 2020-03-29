import scala.annotation.tailrec

// tail recursive version
def factorial(n: Int): Int = {
	@tailrec
	def loop(acc: Int, n: Int): Int =
		if (n == 0) acc
		else loop(acc * n, n - 1)
	loop(1, n)
}

factorial(1)
factorial(4)
factorial(5)
factorial(6)
