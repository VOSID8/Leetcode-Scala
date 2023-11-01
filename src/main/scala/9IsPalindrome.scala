object Solution {
    def isPalindrome(x: Int): Boolean = {
        //https://leetcode.com/problems/palindrome-number/description/
        def Helper(rx: String): Boolean = {
            if(rx.length == 1) true
            else if(rx(rx.length-1) == rx(0) && rx.length == 2) true
            else if(rx(rx.lenacgth-1) != rx(0)) false
            else Helper(rx.dropRight(1).drop(1))

        }
        Helper(x.toString)
    }
}