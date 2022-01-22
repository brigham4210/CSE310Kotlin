fun main(){
    val c = Person("Chris",172f,50f)
    c.everything()  
    
    val b = Person("Bri",175f,150f)
    b.everything()  
    
    val d = Person("David",188f,100f)
    d.everything() 
}

class Person(name: String, height: Float, weight: Float) {
    // Basic information
    val name: String = name
    val height: Float = height
    val weight: Float = weight

    fun list(){
        // Make a basic list for a person 

        println("Name: $name")
        println("Height: $height cm")
        println("Weight: $weight KG") 
    }

    fun BMI (){
        // Calculate the BMI= KG/m/m

        val bmi: Float = weight/((height/100)*(height/100))
        println("BMI: $bmi")
        if (bmi < 18){
            println("You need to gain more weight")
        }else if (bmi > 26){
            println("You need to lose some weight")
        }else{
            println("Your BMI value shows that you are GOOD!")}  
    }

    fun ideal_weight(){
        // The ideal weight is when BMI=22

        val iw = 22 * (height/100)*(height/100)
        println("$iw KG is your idea weight!") 
    }

    fun Adjust_weight(){
        // for loop is to calculate how much weight to gain or lose to be BMI=22

        val bmi = weight/((height/100)*(height/100))
        // BMI < 18 means too light 

        if (bmi <18){
            // weight when BMI=18
            var iw = 18*(height/100)*(height/100)
            var gain = iw - weight
            println("You need to be over $iw KG")
            println("You need to gain at least $gain KG") 
            iw = 22*(height/100)*(height/100) 
            gain = iw - weight
            val add = gain/12
            println()
            println("Here are the goals for each month for you:")
            for (i in 1..12){
                val w = weight + add*i
                println("Your goal for $i month is $w .")
            }
        } else if (bmi <34){
            // for BMI between 26 and 34
            //// weight when BMI=26
            var iw = 26*(height/100)*(height/100)
            var lose = weight - iw
            println("You need to be less than $iw KG")
            println("You need to lose at least $lose KG")
            iw = 22*(height/100)*(height/100)
            lose = weight - iw
            val minus = lose/12
            println()
            println("Here are the goals for each month for you:")
            for (i in 1..12){
                val w = weight - minus*i
                println("Your goal for $i month is $w .")
            } 
        } else if (bmi >34){
            //// This part is for much Overweight people whose BMI >34
            var iw = 26*(height/100)*(height/100)
            var lose = weight - iw
            println("You need to be less than $iw KG")
            println("You need to lose at least $lose KG")
            iw = 22*(height/100)*(height/100)
            lose = weight - iw
            val minus = lose/18
            println()
            println("Here are the goals for each month for you:")
            for (i in 1..18){
                val w = weight - minus*i
                println("Your goal for $i month is $w .")
            } 
        } else{ println("Keep it up!")}}

    fun everything(){
        // run all of the functions in this class

        val person = Person(name, height, weight)
        person.list()
        person.BMI()
        person.ideal_weight()
        person.Adjust_weight()
        println()
        println()
    }
}
