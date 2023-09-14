
open class Line(var startPoint: Point, var endPoint: Point):Point(startPoint.x, startPoint.y) {

    override fun Info(){
        println("Line = ${startPoint.x} , ${startPoint.y} , ${endPoint.x} , ${endPoint.y}")
    }


}