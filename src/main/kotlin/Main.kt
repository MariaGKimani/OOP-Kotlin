import java.util.Date

fun main(){
    var maria = Human("goretti",22,77.0)

    (maria.eat(10))

     var addw = maria.weight
    println(addw)

    var result2 = maria.speak()
    println(result2)

      maria.birthday(1)
     var finalAge =maria.age
    println(finalAge)


    val persons2 = Persons("Mariagoretti","Kimani","mgmkimani@gmail.com","0767890567","fgr45")
    val pass = persons2.password
   val fname = persons2.firstName
    println(pass)
    println(fname)
}

class Human(var name: String, var age: Int, var weight: Double){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }

    fun speak(){
        println("I hate  Gizards")
    }
    fun birthday(date: Int){
        age +=date
    }
}
data class Persons (val firstName: String, val lastName: String, val email: String,val phoneNumber: String,val password: String)
