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

def fact(n:Int)=product(x=>x)(1,n)

//generalization with algebra flavour, addition and multiplication are nothing but binary operation under a group, which has zero and unit
// elements 
def mapReduce(f:Int=>Int, combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int=
    if(a>b) zero
    else combine(f(a),mapReduce(f,combine,zero)(a+1,b))

