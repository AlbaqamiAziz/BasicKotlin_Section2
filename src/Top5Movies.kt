fun main(){

    val top5Movies = arrayOf("", "", "", "", "")

    println("Enter your Top 5 Movies")
    for(i in 0..top5Movies.size-1){
        print("Movie Number " + (i+1) + " : ")
        top5Movies[i] = readLine().toString()
    }

    print("your Top 5 Movies are : ")
    for(i in 0..top5Movies.size-1){
        print(top5Movies[i] + ", ")
    }
    println("Thank you!")
}