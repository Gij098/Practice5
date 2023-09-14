
fun main(args: Array<String>) {
    val point = Point(2, 4 )
    point.Info()

    val coloredPoint = ColoredPoint(4, 8, "Black")
    coloredPoint.Info()

    val line =  Line(Point(2, 4), Point (3, 6))
    line.Info()

    val coloredLine = ColoredLine(Point(4, 2), Point(6, 8), "Blue")
    coloredLine.Info()

    val Polygon = Polygon(Point(4, 6), Point(3, 1), Point(9, 5))

}