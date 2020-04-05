def sum(f: Int => Int): (Int, Int) => Int = {
	def sumF(a: Int, b: Int): Int = {
		if (a > b) 0
		else f(a) + sumF(a + 1, b)
	}
	sumF
}

sum(x=>x) (1,10)

def sumInts(a: Int, b: Int) = sum(x => x) (a,b)
def sumSquares(a: Int, b: Int) = sum(x => x * x) (a, b)
def sumCubes(a: Int, b: Int) = sum(x => x * x * x) (a,b)

// sum of ints
sumInts(99, 100)

// sum of squares
sumSquares(1, 2)

// sum of cubes
sumCubes(2, 3)