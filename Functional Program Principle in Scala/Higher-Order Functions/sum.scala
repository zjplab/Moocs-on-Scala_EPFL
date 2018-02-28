def sum(f:Int=>Int, a:Int, b:Int):Int=
  if(a>b) 0
  else f(a)+sum(f,a+1.b)
  
def sumInt(a:Int,b:Int):Int=sum(id,a,b)
def sumCubes(a:Int,b:Int):Int=sum(cube,a,b)
def sumFactorials(a:Int,b:Int):Int=sum(fact,a,b)

def id(x:Int)=x
def cube(x:Int)=x*x
def fact(x:Int):Int=if(x==0) 1 else x*fact(x-1)
