package jp.techacademy.yuki.sakamaki.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val hito = Human("酒巻",12,"世界")
        hito.say()
        hito.think()

        val hito2 = Human("佐藤",15,"パズル")
        hito2.say()
        hito2.think()
    }
}