fun main(args: Array<String>){ //Quitar el número del fun y del nombre del archivo, los demás quedan con número (tanto en fun como en nombre de archivo)
    val intArray=intArrayOf(1,4,9,100)
    val booleanArray=booleanArrayOf(true, false, true, true)
    
    println(intArray[0])
    println(booleanArray[2])

    val doubleArray=DoubleArray(3){50.25}
    println(doubleArray[0])
}