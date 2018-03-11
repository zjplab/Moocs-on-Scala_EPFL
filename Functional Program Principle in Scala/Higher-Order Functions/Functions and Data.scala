object Rationals{
val x=new Rationals(1,2)
val y=new Rationals(5,7)
val z=new Rationals(3,2) 
x.numer
x.denum
x.sub(y).sub(z)
y.add(y)  
}

class Rational(x:Int, y:Int){
require(y!=0,"denominator  must be nonzero!")
  
def this(x:Int)=this(x,1)//2nd constructor 
  
private def gcd(a:Int, b:Int):Int=if(b==0) a else gcd(b,a%b)
private val g=gcd(x,y)
def  numer=x/g //or val numer=x/gcd(x,y
def  denom=y/g // or val denom=y/gcd(x,y)

def less(that:Rational)=numer*that.denom< that.numer*denom
def add(that:Rational)=
  new Rational(numer*that.denom + that.numer*denom, //actually this.numer*that.denom...
               denom*that.denom)
  
def max(that:Rational)=
  if(this.less(that) that else this 
     
override def toString=numer+'/'+denom 
/* override def toString={
val g=gcd(numer,denom)
numer/g+"/"+denom/g
} */
def neg:Rational=new Rational(-numer,-denom)
  
def sub(that:Rational)=add(that.neg)  
}

