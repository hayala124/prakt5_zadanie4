import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.roundToInt

open class Triangle(x1:Int, y1:Int, x2:Int, y2:Int, x3:Int, y3:Int): Point(x1, y1, x2, y2, x3, y3) {

    fun Area_Radius(){
        val AB:Double = (sqrt(((x2-x1).toDouble()).pow(2) + ((y2-y1).toDouble()).pow(2))* 100.0).roundToInt() / 100.0
        val BC:Double = (sqrt(((x3-x2).toDouble()).pow(2) + ((y3-y2).toDouble()).pow(2))* 100.0).roundToInt() / 100.0
        val AC:Double = (sqrt(((x3-x1).toDouble()).pow(2) + ((y3-y1).toDouble()).pow(2))* 100.0).roundToInt() / 100.0

        if (((AB + BC) > AC) && ((AC + BC) > AB) && ((AC + AB) > BC)) {
            val p:Double = (AB + BC + AC)/2
            val S = (sqrt(p * (p - AB) * (p - BC) * (p - AC)) * 100.0).roundToInt() / 100.0
            println("Площадь треугольника = $S")
            val R = abs(AB * BC * AC)/(4 * S)
            println("Радиус окружности описанной вокруг треугольника = $R")
        }
        else {
            println("Такой треугольник не существует")
        }
    }
}