package com.zfuncode.chaptertiga_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

//    deklarasi variable global
    lateinit var edtAngkaSatu : EditText
    lateinit var edtAngkaDua : EditText
    lateinit var buttonHitung : Button
    lateinit var textHasil : TextView
    lateinit var btnReset : Button
    lateinit var textKondisi : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        edtAngkaSatu = findViewById(R.id.angkaSatu)
        edtAngkaDua = findViewById(R.id.angkaDua)
        buttonHitung = findViewById(R.id.btnHitung)
        textHasil = findViewById(R.id.txtHasilAngka)
        btnReset = findViewById(R.id.btnReset)
        textKondisi = findViewById(R.id.txtKondisi)

        buttonHitung.setOnClickListener{
            var input = edtAngkaSatu.text.toString().toInt()
            var inputdua = edtAngkaDua.text.toString().toInt()
            var jumlah = input + inputdua
            textHasil.text = jumlah.toString()
             if (jumlah > 100){
                 textKondisi.text = " Nilai lebih dari 100"
             }else{
                 textKondisi.text = "Nilai kurang dari 100"
             }
        }

        btnReset.setOnClickListener{
            resetData()
        }

        btnContoh.setOnClickListener{

        }

    }

    fun resetData(){
        edtAngkaSatu.setText("")
        edtAngkaDua.setText("")
    }





}