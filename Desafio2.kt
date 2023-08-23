fun main(){
    val celsiu: Double = 25.0
    val fahrenheit: Double = (celsiu * 9/5) + 32
    val kelvin: Double = celsiu + 273.15

    println(" As conversoes de temperatura sao: \n" 
            + "Celsiu: " + celsiu + "°C"
            + "\nFahreinheit: " + fahrenheit 
            + "\nKelvin: " + kelvin )
}