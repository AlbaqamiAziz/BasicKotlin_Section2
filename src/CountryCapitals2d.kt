fun main() {
    val countriesCapitals = arrayListOf<ArrayList<String>>()

    println("Enter the country with its capital city ")
    while(countriesCapitals.size <3 ){
        print("Country : ")
        val country = readLine().toString()
        print("City : ")
        val city = readLine().toString()
        countriesCapitals.add(ArrayList(listOf(country,city)))
    }

    println("Country with its capital city ")
    for (i in 0..countriesCapitals.size-1){
        for (j in 0..countriesCapitals[i].size-1) {
            print(countriesCapitals[i][j] + " ")
        }
        println()
    }

}