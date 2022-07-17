class Movie(var name:String, var duration:Int, var available: Boolean){
   fun play(): Boolean{  
    var played=true
    if(available){ 
        for (i in 0..10){
            var a=duration-duration/10*i
            var duration=a.toString()
            println("Playing movie $name...restan $a minutos")     
        }
    } else {
        println("The movie is not available")
        played=false
    }
    return played
}

fun pause(){
    
        println("Movie paused")
}

override fun toString():String{
    return "$name: $duration min"
}
}