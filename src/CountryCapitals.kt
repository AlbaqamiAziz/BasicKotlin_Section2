fun main() {
    val countries = arrayListOf<String>("Saudi Arabia","ireland","Japan")
    val countriesCapitals = arrayListOf<ArrayList<String>>()

    for (country in countries){
        print("Enter the capital city of the $country : ")
        countriesCapitals.add(ArrayList(listOf(country, readLine().toString())))
    }

    for (i in 0..countriesCapitals.size-1){
        for (j in 0..countriesCapitals[i].size-1) {
            print(countriesCapitals[i][j] + " ")
        }
        println()
    }

}