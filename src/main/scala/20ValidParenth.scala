object Solution {
    //https://leetcode.com/problems/valid-parentheses/description/
    def isValid(s: String): Boolean = {
        import scala.collection.mutable

        val pairs = Map(')' -> '(', '}' -> '{', ']' -> '[')
        val stack = new mutable.Stack[Char](s.length)

        s.foreach{ x =>
            x match {
            case c if pairs.contains(c) =>
                if(stack.isEmpty || pairs(c)!=stack.pop()) return false
            case c => stack.push(c)
            }
        }

        stack.isEmpty

    }
}
