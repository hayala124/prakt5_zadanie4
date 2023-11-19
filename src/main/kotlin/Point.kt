open class Point(_x1:Int, _y1:Int, _x2:Int, _y2:Int, _x3:Int, _y3:Int) {
    open var x1 = _x1
    open var y1 = _y1
    open var x2 = _x2
    open var y2 = _y2
    open var x3 = _x3
    open var y3 = _y3

    init{
        println("Введите координаты первой точки:")
        x1 = readln().toInt()
        y1 = readln().toInt()
        println("Введите координаты второй точки:")
        x2 = readln().toInt()
        y2 = readln().toInt()
        println("Введите координаты третьей точки:")
        x3 = readln().toInt()
        y3 = readln().toInt()
    }
}