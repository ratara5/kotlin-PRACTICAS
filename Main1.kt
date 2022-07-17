fun main1(args: Array<String>){ //Quitar el número del fun y del nombre del archivo
    println("¡Hola mundo!")
    var age: Int=25 //No es necesario indicar el tipo de variable*
    var altura: Double=1.80000000 
    var peso: Float=80.5000f //Recordar agregar f al final
    var esMujer: Boolean=true
    var longValue: Long=121654654631 //*Solo en  el caso de long a menos que**
    var longValueC: Long=121654654631L //**se le agregue L al final
    val numDientes=32 //Un val ya no puede cambiar su valor***
    age=30 //***como si lo puede hacer una var. Siempre usar val o var según el caso

    println(age)
    println(altura)
    println(peso)
    println(esMujer)
    println(longValue)

    var name: String="Pacho Lado"
    println(name)
    var nameLenght: Int=name.length
    println(nameLenght)
    var nameIsEmpty: Boolean=name.isEmpty()
    println(nameIsEmpty)
    var nameContains: Boolean=name.contains("Lado")
    println(nameContains)
   
    var mySubString: String=name.substring(2,5) //Toma el elemento inicial del intervalo, pero no toma el final
    println(mySubString)
    var myReplace: String=name.replace('a','u')
    println(myReplace)

    var description: String="Hola soy $name, tengo $age y mi altura es $altura y mi peso es de $peso"//Se va a imprimir solo el primer decimal
    var stringFormat= String.format("Hola soy %s, tengo %d y mi altura es %.2f y mi peso es de %f", name, age, altura, peso) //Los .# en %f sirven para indicar cuantas posiciones decimales mostrar, cuando no se ponen, se muestran todos
    println(description)
    println(stringFormat)

    

}