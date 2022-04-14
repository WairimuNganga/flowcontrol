/*.Create a classCurrentAccount with the following attributes:account
number, account name, balance. It has the following functions:
a.deposit(amount: Double) - Increments the balance bythe
amount deposited
b.withdraw(amount: Double) - Decrements the balanceby the
amount withdrawn
c.details() - Prints out the account number and balanceand
name in this format: “Account number x with balance y is
operated by z”(5points)
 */
fun main(){
    var accountDetails = CurrentAccount(123456,"Mwongolia",4005.06)
    accountDetails.deposit(200.00)
    accountDetails.withdraw(125.50)
    accountDetails.details()


    var item1 = Product("Soap",20.04,35.00,"hygiene")
    item1.category
    item1.categories(item1)
    var item2 = Product("pepper",2.4,1.00,"groceries")
    item2.category
    item2.categories(item2)
    var item3 = Product("millet flour",1.5,120.00,"other")
    item3.category
    item3.categories(item3)

}
open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }
    open fun withdraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}







/*.Create another classSavingsAccount. It has the same functions and
attributes as the current account except for one attribute,
withdrawals: Int. Withdrawals is a counter variable that is used to
keep track of how many withdrawals have been made from the account
in a year. The only other difference is that the savings account
withdraw() method first checks if the number of withdrawals is less
than 4 for it to allow one to withdraw money from the account. It also
increments the withdrawals attribute after a successful withdrawal
(5points)
 */

class SavingsAccount(accountNumber: Int,accountName: String,balance: Double):CurrentAccount(accountNumber,accountName,balance) {
     fun withdraw(num:Int):Int{
        var withdrawals = 0
        if (num < 4) {
            withdrawals+=num


        }
         return withdrawals
    }

    /*3.A product is represented by a data class with these attributes: name,
weight, price, category. Category can either be groceries, hygiene or
other. Write a function that takes in a product and uses a when
statement to assign each product to a list based on its category
(3 points)
 */
    class Product(var name: String, var weight: Double, var price: Double, var category: String) {
        fun categories(product: Product) {
            var categoryHygiene = mutableListOf<Product>()
            println(categoryHygiene)

            var categoryGroceries = mutableListOf<Product>()
            println(categoryGroceries)

            var categoryOther = mutableListOf<Product>()
            println(categoryOther)
            when (category) {
                "hygiene" -> (categoryHygiene.add(product))
                "groceries" -> (categoryGroceries.add(product))
                "other" -> (categoryOther.add(product))
            }

        }
    }

    /*Write a function that given a string returns a string composed of only
the characters in even indices. For example given “banana” it will return "bnn"
 */
    fun evenIndices(name: String): String {
        var word = ""
        name.forEachIndexed { int, letter ->
            if (int % 2 == 0) {
                word += letter
            }
        }
        return word
    }
}
