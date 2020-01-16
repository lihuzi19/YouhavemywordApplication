package com.lihuzi.youhavemywordapplication.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.lihuzi.stream.parse.IntParse
import com.lihuzi.youhavemywordapplication.R
import com.lihuzi.youhavemywordapplication.consts.Consts

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var parseBase = IntParse()
        var parseResult = parseBase.parse(parseBase.toByteArray(Consts.env))
        println(parseResult)


        act_main_center_tv.text = parseResult.toString()
        act_main_center_tv.setOnClickListener { view->
            onclick(view.id)
        }


    }

    fun onclick(id: Int) {
        when (id) {
            1 -> println(id.toString())
        }
    }
}
