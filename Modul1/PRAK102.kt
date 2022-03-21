import java.util.Scanner;

fun main(args: Array<String>){
    val input = Scanner(System.`in`)

    print("Nilai x = ")
    var x = input.nextInt()

    hitung(x)
}

fun hitung(x: Int){
    val fx = ((2*(x*x))+(5*x)-8)
    print(fx)
}