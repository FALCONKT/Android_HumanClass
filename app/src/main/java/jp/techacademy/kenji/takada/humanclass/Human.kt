package jp.techacademy.kenji.takada.humanclass

import android.util.Log

//Animalは外部から読み込まないと出てこない
import jp.techacademy.kenji.takada.Animal

//抽象Classである　Animal Class　を　継承　　Interface = Movable を追加
open class Human:Animal,Thinkable {

//  Property
    var hobby:String

// 引数付きConstructor
// 抽象Classが　AnimalClass　それが親　それを継承している。
    constructor(name: String, age: Int, hobby: String) :super(name,age){
        // 趣味だけは元が無いため単独初期化
        this.hobby = hobby
    }

    // Method　　
    // 抽象Classである　AnimalClass　の　Method　を　OverRide　上書き　固有のものとなっている
    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」")
    }

    // Method　　
    // 抽象Classである　Innterface　のMethod　を　OverRide
    override fun think() {
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }

}