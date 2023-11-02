object Solution {
    def mySqrt(x: Int): Int = {
        def goodEnough(guess: Double, x: Double): Boolean =
        Math.abs(guess * guess - x) < 0.001
    def improve(guess: Double, x: Double): Double =
        (guess + x / guess) * 0.5
    def tryit(guess: Double, x: Double): Double =
        if (goodEnough(guess, x)) guess
        else tryit(improve(guess, x), x)
    tryit(0.001, x).toInt
}
}
