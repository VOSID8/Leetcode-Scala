object Solution {
    def reverseWords(s: String): String = {
        s.split(" ")
        .toList.reverse.filter(s => !s.trim.isEmpty)
        .mkString(" ")
    }
}