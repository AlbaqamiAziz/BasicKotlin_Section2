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

    // 2D ArrayLists

    val credentials = arrayListOf<ArrayList<String>>()

    credentials.add(ArrayList(listOf("user1", "12345")))
    credentials.add(ArrayList(listOf("user2", "password")))
    credentials.add(ArrayList(arrayListOf("Bob", "00000")))
    credentials.add(ArrayList(arrayListOf("Tim", "55555")))

    println(credentials[2][0])  // --> Bob
    println(credentials[0][1])  // --> 12345
    println(credentials.get(0).get(1))





}