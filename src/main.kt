fun main () {
    me("mitchelle","21")
    school()
    callout()
    name()
}
//Assignment 3: Strings

    //Given a string “akira chix”. Write a function that prints out a string composed of
   //the first, third and fourth characters of the string (2 points)
fun school() {
        var c = "akirachix"
        println(c[0].toString() + c[2] + c[3])
    }

//2.Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
    //y are the provided name and age respectively. (3 points)

fun me(name: String, age: String):String{
    var x = ("my name is $name and i am $age years old")
    println(x)
    return x
}
//3.Write a function that takes in a String and returns its length (2 points)
fun callout (){
    var g= "interest"
    println(g.length)
}
//4.Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is” (3
fun name(){
    var name = "mitchelle hope waithera"
    var i = name
    if (name ==i){
        println("Thats me!")
        }
        else{
            println("i dont know who that is")
        }

}



