package jp.techacademy.kenji.takada

//抽象Class
abstract class Animal {

    //  Property
    var name:String
    var age:Int

    //    引数Constructor
    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    abstract fun say()

}