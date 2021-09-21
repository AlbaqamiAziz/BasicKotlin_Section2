fun main(){

    // arrays list
    val shoppingList = ArrayList<String>()

    shoppingList.add("Eggs")
    shoppingList.add("Bread")
    shoppingList.add("Milk")
    shoppingList.add("Bananas") // add

    shoppingList[0] = "Butter" // change by index

    shoppingList.remove("Milk") // remove
    shoppingList.add("Apples")

    println(shoppingList)
    shoppingList.sort() // sort
    println(shoppingList)

    // array list of
    val numbers = arrayListOf<Int>()
    for (i in 0..5){
        numbers.add(i)
    }
    val sum = numbers.sum()
    print(sum)

    val list = arrayListOf<Int>()
    println("list.isEmpty() is ${list.isEmpty()}") // true

    list.addAll(listOf(2,3,4,5))
    println(list) // [1, 2, 3]


}