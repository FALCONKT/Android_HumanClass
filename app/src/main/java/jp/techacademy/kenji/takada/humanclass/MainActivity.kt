package jp.techacademy.kenji.takada.humanclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instance化①　　人名は文字列　年齢は数値　趣味は文字列
        val man1 = Human("人間１",25,"Sky")
        man1.say()
        man1.think()

        //Instance化②　　人名は文字列　年齢は数値　趣味は文字列
        val man2 = Human("人間２",35,"絵画")
        man2.say()
        man2.think()


    }
}
