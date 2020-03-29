package recfun

import scala.annotation.tailrec

object RecFun extends RecFunInterface {

	def main(args: Array[String]): Unit = {
		println("Pascal's Triangle")
		for (row <- 0 to 10) {
			for (col <- 0 to row)
				print(s"${pascal(col, row)} ")
			println()
		}
	}

	/**
	 * Exercise 1
	 */
	def pascal(c: Int, r: Int): Int = {
		if (c == r || c == 0) 1
		else pascal(c, r - 1) + pascal(c - 1, r - 1)
	}

	/**
	 * Exercise 2
	 */

	def balance(chars: List[Char]): Boolean = {
		@tailrec
		def rec(chars: List[Char], numOpen: Int): Boolean = {
			if (chars.isEmpty) numOpen.equals(0)
			else if (chars.head == '(') rec(chars.tail, numOpen + 1)
			else if (chars.head == ')') numOpen > 0 && rec(chars.tail, numOpen - 1)
			else rec(chars.tail, numOpen)
		}

		rec(chars, 0)
	}

	/**
	 * Exercise 3
	 */
	def countChange(money: Int, coins: List[Int]): Int = {
    def combo(money: Int, coins: List[Int]): Int = {
      def comboLoop(coins: List[Int]): Int =
        if (coins.isEmpty) 0
        else combo(money - coins.head, coins) + comboLoop(coins.tail)
      if (money == 0) 1
			else if (money < 0) 0
			else comboLoop(coins)
		}
		combo(money, coins)
	}
}
