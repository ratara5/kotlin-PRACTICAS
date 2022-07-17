fun main(args: Array<String>){

    var comidas=arrayOf("bandeja","mondongo","lechona","cuy")
    for (comida in comidas){
        println(comida)
    }

    val naturales=intArrayOf(1,2,3,4,5)
    var total=1
    for (numero in naturales){
        total*=numero
    }
    println(total)

    println("¿Cuál es tu nombre?")
    val name=readLine()
    println("¿A qué te dedicas?")
    val job=readLine()
    println()
    println("Hola ${name}, eres un muy buen ${job}")

    val scanner=Scanner(System.'in')
    println("Inserta un número")
    val number=scanner.nextInt
    val otherNumber=number+10
    println(otherNumber)

}