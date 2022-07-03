import enum_when.*

fun main(args: Array<String>) {
    println("Hello World!")
    print("taxijjang")
    println("Program arguments: ${args.joinToString()}")
    println(max(1,3))

    val person = Person("택시짱", false)
    print(person.name)
    println(person.isMarried)

    val rectangle = Rectangle(41,41)
    println(rectangle.isSquare)

    println(Color2.BLUE.rgb())
    println(getMnemonic(Color2.VIOLET))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

class Person(
    val name:String,
    val isMarried:Boolean
)

class Rectangle(val width:Int, val height: Int){
    val isSquare: Boolean
        get(){
            return width == height
        }
}