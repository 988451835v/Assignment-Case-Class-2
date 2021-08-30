object Q1 extends App{
    val p1=new point(5,6)
    val p2=new point(8,9)

    val p3=p1.add(p2)
    println("Addition of two points:",p3)
    val p4=p1.move(5,7)
    println("After moving dx and dy",p4)
    val p5=p1.distance(p2)
    println("Distance between two given points",p5)
    val p6=p1.invert()
    println("After switching two numbers",p6)

}

  case class point(x:Int,y:Int) {
//    def x: Int = a;
//    def y: Int = b;
//      def +(that: point) = point(this.x+ that.x, this.y + that.y)
      def add(that: point) = point(this.x+ that.x, this.y + that.y)
      def move(dx: Int, dy: Int) = point(this.x+dx,this.y+dy)
      def distance(that:point)={
              math.sqrt(math.pow((this.x - that.x), 2) + math.pow((this.y - that.y), 2))
              }

      def invert()=point(x=y, y=x)
  }

