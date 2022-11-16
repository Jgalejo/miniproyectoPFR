def simpsonuntercio(a:Int,b:Int,f:Double => Double):Double={
  (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
}
val funcion  = (x:Double) => -Math.pow(x,2)+(8*x)-12
simpsonuntercio(3,5,funcion)

val h = (x : Double) => 3*Math.pow(x,2)
val i = (x : Double) => x+2*Math.pow(x,2)- Math.pow(x,3)+5*Math.pow(x,4)
val j = (x : Double) => ((2*x+1)/(Math.pow(x,2)+x))
val k = (x : Double) => Math.pow(Math.E,x)
val l = (x : Double) => (1/Math.sqrt(x-1))
val m = (x : Double) => (1/(1+Math.pow(x,2)))

val i1 = simpsonuntercio(3,5,f)
val i2 = simpsonuntercio(0,2,h)
val i3 = simpsonuntercio(-1,1,i)
val i4 = simpsonuntercio(1,2,j)
val i5 = simpsonuntercio(0,1,k)
val i6 = simpsonuntercio(2,3,l)
val i7 = simpsonuntercio(0,1,m)


def erroraproximacion(a : Double, b : Double) : Double = (a - b).abs

val vesp1 = 7.33
val vesp2 = 8
val vesp3 = 3.333
val vesp4 = 1.09861
val vesp5 = 1.71828
val vesp6 = 0.828427
val vesp7 = 0.785398

erroraproximacion(i1, vesp1)
erroraproximacion(i2, vesp2)
erroraproximacion(i3, vesp3)
erroraproximacion(i4, vesp4)
erroraproximacion(i5, vesp5)
erroraproximacion(i6, vesp6)
erroraproximacion(i7, vesp7)



def simpsoncompuesta(a:Int,b:Int,n:Int,f:Double=>Double) : Double={
  var rango = 1 to n-1

  (b-a)/n * ((f(a+rango*(b-a/n - 2)))+4*(f(a+rango*(b-a/n - 1)))+(f(a+rango*(b-a/n)))).sum

}

val f=(x:Double) => -Math.pow(x,2)+(8*x)-12

simpsoncompuesta(3,5,2,f)
