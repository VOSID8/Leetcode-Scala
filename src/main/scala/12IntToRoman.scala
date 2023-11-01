object Solution {
    //https://leetcode.com/problems/integer-to-roman/description/
    def intToRoman(num: Int): String = {
        def helper(rnum:Int, result: String): String = {
            if(rnum >= 1000) helper(rnum-1000, result :+ 'M')
            else if(rnum < 1000 && rnum > 899) helper(rnum-900,result + "CM")
            else if(rnum >= 500) helper(rnum-500, result :+ 'D')
            else if(rnum < 500 && rnum > 399) helper(rnum-400,result + "CD")
            else if(rnum >= 100) helper(rnum-100, result :+ 'C')
            else if(rnum < 100 && rnum > 89) helper(rnum-90,result + "XC")
            else if(rnum >= 50) helper(rnum-50, result :+ 'L')
            else if(rnum < 50 && rnum > 39) helper(rnum-40,result + "XL")
            else if(rnum >= 10) helper(rnum-10, result :+ 'X')
            else if(rnum < 10 && rnum > 8) helper(rnum-9,result + "IX")
            else if(rnum >= 5) helper(rnum-5, result :+ 'V')
            else if(rnum < 5 && rnum > 3) helper(rnum-9,result + "IV")
            else if(rnum >= 1) helper(rnum-1, result :+ 'I')
            else result
        }
        helper(num,"")
    }
}