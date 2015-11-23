package sun.bob.learnkt

import kotlin.test.todo

/**
 * Created by bob.sun on 15/11/19.
 */

fun NumberConversion(num :Int){
    print("toByte ${num.toByte()}")
    print("toChar ${num.toChar()}")
    print("toLong ${num.toLong()}")
    print("\n")
}

fun ByteOperation(num :Int, offset :Int){
    print("Shitf left ${(num shl offset)}")
    print("Shitf right ${(num shr offset)}")
    print("And ${(num and offset)}")
    print("Or ${(num or offset)}")
//    print("Inversion ${(inv num)}")   //WTF happened to this function?
    print("\n")

}

fun Characters(c :Char){
    //todo
    //Chars can NOT treated as numbers in Kotlin

//    if (c == 1){
//
//    }

    //todo
    //Chars can be converted to other types.
    print("Char to Int: ${c.toInt()}")

    //todo
    //Chars can have ranges like numbers.
    if (c !in 'a'..'Z'){
        println("Char is NOT illegal")
        throw IllegalArgumentException("Char out of range")
    } else {
        println("Char is valid")
    }

}

fun Arrays(){
    //todo
    //Initialize while create
    var a1 = arrayOf(1, 2, 3, 4, 10, 32, 654, 53, 54, 12, 61, 85)
    for (v in a1){
        print(v)
    }
    println()

    //todo
    //Initialize first, then put values.
    //Array is fixed size in Kotlin.
    var a2 :IntArray = IntArray(9)
    a2[0] = 234
    a2[1] = 43
    a2[2] = 5678
    for (v in a2){
        print(v)
    }
    println()

}

fun ControlFlow(a :Int, b :Int){
    //todo
    //`IF`
    //`IF` is an expression in Kotlin. So it can return values
    //Last expression is return value of if blocks.
    //No more ternary operator ( cond ? case1 : case2 ) in Kotlin
    val max = if (a > b) a else b
    println("max: " + max)
    val min = if (a > b){
        println("a-> ${a} is larger")
        b
    } else {
        println("b->${b} is larger")
        a
    }
    println("min: " + min)

    //todo
    //`WHEN`
    //`WHEN` expression is Kotlin version of `switch`
    var cond :Int = 12
    when(cond){
        max -> println("Condition ${cond} is equal to max")
        min -> println("Condition ${cond} is equal to min")
        in 0..20 -> println("Condition ${cond} is less than 20")
        in 12..40 -> println("Condition ${cond} is less than 40")
        else -> {
            //todo
            //`default` block
            println("defualt")
        }
    }

}
//
//fun main(args: Array<String>) {
//    //Number's built in conversions.
//    NumberConversion(96)    //Dev
//    NumberConversion(0b1100001) //Bin
//    NumberConversion(0x62)  //Hex
//
//    //todo
//    //Byte operation.
//    //Byte operation characters like >> << ~ & | no longer works in Kotlin
//    ByteOperation(0b100, 3)
//
////    Characters('\n')
////    Characters('h')
//
//    Arrays()
//
//    ControlFlow(53, 12)
//}