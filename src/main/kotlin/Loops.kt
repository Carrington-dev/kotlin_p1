fun main(args: Array<String>) {
    for(i in 1 until 10){
        if (i == 5)
            continue
        print("$i ")
    }
    print("\n")

    for(i in 1..10){
        if (i == 5)
            continue
        print("$i ")
    }
    print("\n")

    for (i in 10 downTo  1){
        if (i == 5)
            continue
        print("${i} ")
    }
    print("\n")
    for(i in 1 until 10 step 3){
        if (i == 5)
            continue
        print("$i ")
    }
    print("\n")
}