import java.lang.NumberFormatException

fun main() {
    try {
        val x1 = 0
        val y1 = 0
        val x2 = 0
        val y2 = 0
        val x3 = 0
        val y3 = 0

        val A = Circle(x1, y1, x2, y2, x3, y3)
        A.Area_Radius()
        A.Coordinates_center()
    }
    catch (e: NumberFormatException) {
        println("Неправильно введённый тип данных")
    }
}
