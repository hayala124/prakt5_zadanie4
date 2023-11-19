import kotlin.math.pow
class Circle(x1:Int, y1:Int, x2:Int, y2:Int, x3:Int, y3:Int): Triangle(x1, y1, x2, y2, x3, y3) {

    fun Coordinates_center() {

        val z1 = x1.toDouble().pow(2) + y1.toDouble().pow(2)
        val z2 = x2.toDouble().pow(2) + y2.toDouble().pow(2)
        val z3 = x3.toDouble().pow(2) + y3.toDouble().pow(2)

        val zx = (y1 - y2) * z3 + (y2 - y3) * z1 + (y3 - y1) * z2
        val zy = (x1 - x2) * z3 + (x2 - x3) * z1 + (x3 - x1) * z2
        val z = (x1 - x2) * (y3 - y1) - (y1 - y2) * (x3 - x1)

        val a = - (zx/(2 * z))
        val b = (zy/(2 * z))
        println("Координаты центра окружности треугольника = ($a; $b) ")
    }
}