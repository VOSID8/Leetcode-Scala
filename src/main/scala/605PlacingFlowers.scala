object Solution extends App {
    //https://leetcode.com/problems/can-place-flowers/description/
    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
        def helper(fb: Array[Int], nn: Int): Boolean = { 
            fb.indices.foreach{x =>
                x match {
                  case 0   => if(fb(x) == 0 && fb(1) == 0) {
                    fb(0) = 1;
                    return true;
                  }
                  case lastIndex if lastIndex == fb.length - 1 => 
                  if(fb(lastIndex) == 0 && fb(lastIndex - 1) == 0) {
                    fb(lastIndex) = 1;
                    return true;
                  }
                  case _ =>  if(fb(x) == 0 && fb(x-1) == 0 && fb(x+1) == 0) {
                    fb(x) = 1;
                    return true
                  }
                }
            }
            return false;
        } 
        def counter(fb2: Array[Int], n2: Int): Boolean = {
          if(n2 == 0) true
          else if(fb2.length == 1) { 
            if(fb2(0) == 0) true
            else false
          }
          else if(n2 == 1) helper(fb2,1)
          else{
            helper(fb2,1)
            counter(fb2, n2-1)
          }
        }
        counter(flowerbed,n)
    }
}
