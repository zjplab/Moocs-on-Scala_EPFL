def sum(f:Int=>Int):(Int,Int)=>Int={
    def sumF(a:Int,b:Int):Int=
        if(a>b) 0
        else f(a)+sumF(a+1,b)
    sumF    
}

def sumInt=sum(x=>x)
def sumCube=sum(x=>x*x)
def sumFactorials=sum(fact)
