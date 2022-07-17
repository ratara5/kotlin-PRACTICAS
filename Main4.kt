fun main(){
    val movieName="ET"
    val duration=90
    val isAvailable=true
    val p=playMovie(movieName, duration, isAvailable)
    if(p){
        pause()
    }
    
}

fun playMovie(mN: String, d: Int, iA: Boolean): Boolean{  
    var played=true
    if(iA){ 
        for (i in 0..10){
            var a=d-d/10*i
            var dur=a.toString()
            println("Playing movie $mN...restan $a minutos")     
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

fun playMovie(mN: String, d: Int): Boolean{  
    var played=true
    if(true){ 
        for (i in 0..10){
            var a=d-d/10*i
            var dur=a.toString()
            println("Playing movie $mN...restan $a minutos")     
        }
    } else {
        println("The movie is not available")
        played=false
    }
    return played
}

fun playMovie(mN: String, d: Int, otherArgument: String): Boolean{  
    var played=true
    if(true){ 
        for (i in 0..10){
            var a=d-d/10*i
            var dur=a.toString()
            println("Playing movie $mN...restan $a minutos")     
        }
    } else {
        println("The movie is not available")
        played=false
    }
    return played
}
