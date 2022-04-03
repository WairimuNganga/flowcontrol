fun main(){
    var oddNums = oddNumbers()
    var wordsLength =namesArray(arrayOf("Mandy","Mellisa","Michelle","Milan","Maya","Mollen"))
    var drinks = serveDrinks(4)
    serveDrinks(9)
    serveDrinks(15)
    serveDrinks(36)
    var multiples = printMultiples()

}
fun oddNumbers() {
    for (n in 1..100) {
        if (n % 2 != 0) {
            println(n)
        }
    }
}
fun namesArray(words:Array<String>):Int{
    var b = 0
    words.forEach { word->
        word.length>5
        b++
    }
    println(b)
    return b

}
fun serveDrinks(age:Int){
    when(age){
        1,2,3,4,5-> println("Glass of milk")
        6,7,8,9,10,11,12,13,14-> println("Fanta Orange")
        else-> println("Coca-cola")

    }
    println(age)
}
fun printMultiples(){
    for (num in 1..100){
        if(num%3==0 && num%5==0){
            println("FizzBuzz")
        }
        else if (num%3 == 0){
            println("Fizz")
        }
        else if(num%5 == 0){
            println("Buzz")
        }
        else {
            println(num)
        }

    }
}
