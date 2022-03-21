import java.util.Scanner

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    print("input bilangan: ")
    var nilai = input.nextInt()

    var ulang = 0
    for (i in 1..100){
        var hasil = nilai*i
        if (hasil%2==0 || hasil%3==0){
            print("$hasil ")

            ulang = ulang+1
        }
        if (ulang == 5){
            break
        }
    }
}