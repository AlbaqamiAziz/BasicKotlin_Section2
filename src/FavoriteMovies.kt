fun main(){

    val favoriteMovies = ArrayList<String>()

    println("Enter your Favorite Movies ( NOTE: You must add at least three movies! ) ")

    while(true){
        print("Enter Movie: ")
        favoriteMovies.add(readLine().toString())
        if (favoriteMovies.size >= 3){
            print("Do you want to add another movie ?")
            val answer = readLine().toString()
            if (answer == "yes" || answer == "Yes"){
                continue
            } else {
                break
            }
        }
    }

    println("Your Favorite Movies are: ")
    for (i in 0..favoriteMovies.size-1){
        print("${favoriteMovies[i]} ,")
    }
}