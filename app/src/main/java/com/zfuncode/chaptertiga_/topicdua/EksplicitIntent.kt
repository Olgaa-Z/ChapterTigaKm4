package com.zfuncode.chaptertiga_.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga_.R
import kotlinx.android.synthetic.main.activity_eksplicit_intent.*

class EksplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eksplicit_intent)

        ambilData()
        ambilDataBundle()

    }

    fun ambilData(){
        var datasatu = intent.getStringExtra("angkasatu")
        var datadua = intent.getStringExtra("angkadua")
        txtAngkasatu.text = datasatu
    }

    fun ambilDataBundle(){
        var bun = intent.extras
        txtAngkasatu.setText(bun!!.getString("satu"))
        txtAngkaDua.setText(bun!!.getString("dua"))
    }


}