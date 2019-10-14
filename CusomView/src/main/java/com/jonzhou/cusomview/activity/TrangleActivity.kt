package com.jonzhou.cusomview.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jonzhou.cusomview.R
import kotlinx.android.synthetic.main.activity_trangle.*

class TrangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trangle)
        triangle_view.setOnClickListener {
            triangle_view.setTriangleColor(R.color.textBlueColor)
        }
    }


    fun btGreen(view: View) {
        triangle_view.setTriangleColor(R.color.textGreenColor)
//        triangle_view.setTriangleColor(Color.GREEN)
    }
    fun btRed(view: View) {
//        triangle_view.setTriangleColor(Color.RED)
                triangle_view.setTriangleColor(R.color.bgRedColor)

    }
    fun btBlue(view: View) {
        triangle_view.setTriangleColor(R.color.bgBlueColor)
//        triangle_view.setTriangleColor(Color.BLUE)
    }

    fun btYellow(view: View){
        triangle_view.setTriangleColor(Color.YELLOW)
    }
}
