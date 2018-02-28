def sum(f:Int=>Int):(Int,Int)=>Int={
    def sumF(a:Int,b:Int):Int=
        if(a>b) 0
        else f(a)+sumF(a+1,b)
    sumF    
}

def sumInt=sum(x=>x)
def sumCube=sum(x=>x*x)
def sumFactorials=sum(fact)


//exercises 1: Write a product function that calculates the sum of values of a fuction for the points in a given interval 
def product(f:Int=>Int)(a:Int,b:Int):Int=
    if(a>b) 1 else f(a)*product(f)(a,b)
