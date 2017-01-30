/* non-tail recursive verison of factorial */
def factorial(n:Int):Int=
  if(n==0) 1 else  n*factorial(n-1)
  
/*tail-recursive version */
object exercise{
  def factorial(n:Int):Int={
      def loop(acc:Int,n:Int)=
        if(n==0) acc
        else loop(acc*n,n-1)
       loop(1,n) 
  }     /* loop ends 
}  
