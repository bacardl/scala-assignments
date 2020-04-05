def sum(f: Int => Int, a: Int, b: Int): Int = {
	def loop(a: Int, acc: Int): Int = {
		if (a > b) acc
		else loop(a + 1, f(a) + acc)
	}

	loop(a, 0)
}

def sumInts(a: Int, b: Int) = sum(x => x, a, b)
def sumSquares(a: Int, b: Int) = sum(x => x * x, a, b)
def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)

// sum of ints
sumInts(99, 100)

// sum of squares
sumSquares(1, 2)

// sum of cubes
sumCubes(2, 3)