package com.danileboyce.customview

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



     lateinit var myView1:MyView1
     lateinit var chbxCircle: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        myView1 = findViewById(R.id.myView1)
        myView1.drawCircle
        chbxCircle.setOnCheckedChangeListener {_,_->
            update()
        }
    }

    fun update() {
        myView1.drawCircle = chbxCircle.isChecked
        myView1.invalidate()
    }
}