def sum(f:Int=>Int, a:Int, b:Int):Int=
  if(a>b) 0
  else f(a)+sum(f,a+1.b)
  
def sumInt(a:Int,b:Int):Int=sum(id,a,b)
def sumCube(a:Int,b:Int):Int=sum(cube,a,b)
def sumFactorial(a:Int,b:Int):Int=sum(fact,a,b)

def id(x:Int)=x
def cube(x:Int)=x*x
def fact(x:Int):Int=if(x==0) 1 else x*fact(x-1)

//Summation with Anonymous Functions 
def sumInt(a:Int,b:Int):Int=sum(x=>x,a,b)
def sumCube(a:Int,b:Int):Int=sum(x=>x*x,a,b)
def sumFactorial(a:Int,b:Int):Int=sum(fact,a,b)

//tail-recursive sum
def sum(f:Int=>Int, a:Int, b:Int):Int={
  def loop(a:Int,acc:Int)=
    if(a>b) acc
    else loop(a+1,acc+f(a))
  loop(a,0)
}
