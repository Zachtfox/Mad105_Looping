fun main() {

    var selection = 0

    do {
        println("Please enter the number that corresponds to your selection")
        println("Which meal would you prefer?")
        println("1) Burger")
        println("2) Hot dog")
        println("3) Mostaccioli")
        println("4) Chicken Wings")
        println("5) None / finish")

        selection = readLine()!!.toInt()


    } while (selection < 5)

    if (selection ==5){
        println("Thank you for your order")
    }






}