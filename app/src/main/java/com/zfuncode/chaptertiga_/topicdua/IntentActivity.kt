package com.zfuncode.chaptertiga_.topicdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga_.R
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentData()
        intentBundle()
        passindDataSerializable()
        passingDataParcelable()

        btnHitung.setOnClickListener {
            val move = Intent(this,EksplicitIntent::class.java)
            startActivity(move)
        }



    }

    fun intentData(){

//        intent ke ExplicitIntent.kt bawa dua data
        btnHitung.setOnClickListener{
            var dataSatu = angkaSatu.text.toString()
            var dataDua = angkaDua.text.toString()

//            key - value
            var inten = Intent(this, EksplicitIntent::class.java)
            inten.putExtra("angkasatu", dataSatu)
            inten.putExtra("angkadua", dataDua)
            startActivity(inten)
        }
    }

//    mengirim data pakai Bundle()
    fun intentBundle(){
        var dataSatu = angkaSatu.text.toString()
        var dataDua = angkaDua.text.toString()

        var bundle = Bundle()
        var pindah = Intent(this, EksplicitIntent::class.java)
        bundle.putString("satu", dataSatu)
        bundle.putString("dua", dataDua)
        pindah.putExtras(bundle)
        startActivity(pindah)
    }

    fun passindDataSerializable(){
        val intent = Intent(this, SerializableActivity::class.java)
        var data = MahasiswaSer("sigit","123456","Informatika")
        intent.putExtra("datamahasiswa", data)
        startActivity(intent)

    }

    fun passingDataParcelable(){
        val inten =  Intent(this, ParcelableActivity::class.java )
        var dataperson = PersonParcelable("dwika",20,"semarang")
        intent.putExtra("dataperson", dataperson)
        startActivity(inten)
    }






}