package com.zfuncode.chaptertiga_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnKlik3 : Button
    lateinit var textHasil2 : TextView
    lateinit var edtNama : EditText
    lateinit var buttonSimpan : Button
    lateinit var textNama : TextView
    lateinit var btnHome : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        pemanggilan id view dari xml
        var btnKlik = findViewById(R.id.btnKlik1) as Button
        var textHasil = findViewById(R.id.txtHasil) as TextView
        var btnKlik2 = findViewById(R.id.btnKlik2) as Button
//        textHasil2 = findViewById(R.id.txthasil2)

        btnKlik3 = findViewById(R.id.btnKlik3)
//        kasih event onClick
        btnKlik.setOnClickListener{
            textHasil.text = "Halo, Terimakasih sudah klik Button 1"
        }

        btnKlik2.setOnClickListener{
            textHasil.text = "Ini Button klik 2"
        }

        setOnClick()
        saveNama()
        intentkeHome()
    }

    fun setOnClick(){
        textHasil2 = findViewById(R.id.txthasil2)
        btnKlik3.setOnClickListener{
            textHasil2.text = "ini adalah button klik 3"
        }
    }

    fun saveNama(){
        edtNama = findViewById(R.id.edttextNama)
        buttonSimpan = findViewById(R.id.btnSimpan)
        textNama = findViewById(R.id.txtNama)

        buttonSimpan.setOnClickListener{
            var nama = edtNama.text.toString()
            textNama.text = nama
        }
    }

    fun intentkeHome(){
        btnHome = findViewById(R.id.btnHome)
//        intent : perpindahan dari 1 activity ke activity lainnyha
        btnHome.setOnClickListener{
            var pindah = Intent(this, HomeActivity::class.java)
            startActivity(pindah)
        }
    }



}