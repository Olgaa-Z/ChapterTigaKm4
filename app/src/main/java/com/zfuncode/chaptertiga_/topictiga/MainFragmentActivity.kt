package com.zfuncode.chaptertiga_.topictiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga_.R
import kotlinx.android.synthetic.main.activity_main_fragment.*

class MainFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

//        var frsatu = FragmentSatu()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcFragment, FragmentDua())
            commit()
        }


        btnFr1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcFragment, FragmentSatu())
                commit()
            }
        }

        btnFr2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcFragment, FragmentDua())
                commit()
            }
        }
    }


}