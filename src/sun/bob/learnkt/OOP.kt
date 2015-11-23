package sun.bob.learnkt

/**
 * Created by bob.sun on 15/11/19.
 */
//todo Class & it's constructors
//Class can have one primary constructor and one or more secondary constructors.
//Primary constructor is part of the class defination.
class Klass(constructorArgs :String){
    //todo Primary Constructor & Init Block
    //The primary constructor can NOT contain any code.
    //Initialize operation is located in an `init` block
    init{
        //Primary constructor's arguments can be accessed in init block
        println("Init with arg: ${constructorArgs}")
    }
    //todo Secondary Constructor
    //Secondary Constructor start with a `constructor` prefix.
    //Secondary Constructor must call primary constructor
    constructor(argS :String, argI :Int):this(argS){
        println("Init with arts:" + argS + argI)
    }

}
//todo Class with No Constructor
//Kotlin will generate a constructor if class has no constructors.
class NoConstructor {

}

//todo Class with private Constructor
class PrivateKlass private constructor(arg :String){

}

//todo Inheritance
//All classes in Kotlin have a common superclass `Any`
//`Any` is similar to but NOT `java.lang.Object`
open class Person(name :String, gender :String, age :Int){
    var name :String
    init {
        this.name = name
    }
    open fun sayName(){
        println(name)
    }
}

class Staff: Person{
    constructor(name :String, gender :String, age: Int, position :String):super(name, gender, age){

    }
    //todo Override functions
    // Functions which be override must declared as open
    override fun sayName(){
        println("Staff:"+super.name)
    }
}

//todo Interfaces
//  Interfaces' functions are declared as open by default.
interface Action1{
    fun doAction()
}
open class Action2{
    open fun doAction(){
        println("Money for nothing,")
        return
    }
}
//todo Interfaces Implementation
class ImplItf() : Action1, Action2(){
    override fun doAction() {
        //todo Supertype in Inheritance
        //  You can specify a super class when using supertype keyword in Kotlin
        super<Action2>.doAction()
        println("Chicks for free")
    }

}
//todo Abstract Classes
abstract class abs(){
    abstract fun absFun();
    fun function(){
        println("Actual Function.")
    }
}
class ImplAbs(): abs(){
    override fun absFun() {
        println("Override abstract function")
    }

}
fun main(args: Array<String>) {
    //todo Create an Object with Class
    var Klass = Klass("WTF")
    var Klass1 = Klass("WTF", 20)
    var Klass3 = NoConstructor()
    //Cause an error
//    var Klass4 = PrivateKlass()
    var person = Person("Bob", "Male", 23)
    person.sayName()
    var staff = Staff("Bob", "Male", 23, "Construction worker")
    staff.sayName()
    var itfImp = ImplItf()
    itfImp.doAction()
    var absImp = ImplAbs()
    absImp.function()
    absImp.absFun()
}