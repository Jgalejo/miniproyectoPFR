def simpsonuntercio(a:Int,b:Int,f:Double => Double):Double={
//Definimos la formula simpson 1/3
  (b-a)*(f(a)+4*f((a+b)/2)+f(b))/6
}

//Ingresamos los valores de las funciones de los ejercicios propuestos

val funcion1 = (x:Double) => -Math.pow(x,2)+(8*x)-12
val funcion2 = (x : Double) => 3*Math.pow(x,2)
val funcion3 = (x : Double) => x+2*Math.pow(x,2)- Math.pow(x,3)+5*Math.pow(x,4)
val funcion4 = (x : Double) => ((2*x+1)/(Math.pow(x,2)+x))
val funcion5 = (x : Double) => Math.pow(Math.E,x)
val funcion6 = (x : Double) => (1/Math.sqrt(x-1))
val funcion7 = (x : Double) => (1/(1+Math.pow(x,2)))

//Calculamos la aproximacion y  obtenemos el resultado

val vob1 = simpsonuntercio(3,5,funcion1)
val vob2 = simpsonuntercio(0,2,funcion2)
val vob3 = simpsonuntercio(-1,1,funcion3)
val vob4 = simpsonuntercio(1,2,funcion4)
val vob5 = simpsonuntercio(0,1,funcion5)
val vob6 = simpsonuntercio(2,3,funcion6)
val vob7 = simpsonuntercio(0,1,funcion7)


def erroraproximacion(a : Double, b : Double) : Double = (a - b) //Funcion para calcular el error

//Valor esperado
val vesp1 = 7.33
val vesp2 = 8
val vesp3 = 3.333
val vesp4 = 1.09861
val vesp5 = 1.71828
val vesp6 = 0.828427
val vesp7 = 0.785398

// Resta de valor obtenido y esperado
erroraproximacion(vob1, vesp1)
erroraproximacion(vob2, vesp2)
erroraproximacion(vob3, vesp3)
erroraproximacion(vob4, vesp4)
erroraproximacion(vob5, vesp5)
erroraproximacion(vob6, vesp6)
erroraproximacion(vob7, vesp7)



