
class ColoredLine(startPoint: Point, endPoint: Point, var color: String) : Line(startPoint, endPoint){
    override fun Info(){
        println("ColoredLine = ${startPoint.x} , ${startPoint.y} , ${endPoint.x} , ${endPoint.y}, color = $color")


    }
}


