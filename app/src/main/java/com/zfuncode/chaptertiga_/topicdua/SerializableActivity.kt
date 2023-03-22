package com.zfuncode.chaptertiga_.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga_.R
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)
        ambilDataSerilizable()
    }

    fun ambilDataSerilizable(){
        var data = intent.getSerializableExtra("datamahasiswa") as MahasiswaSer
        txtJurusan.text =  data.jurusan
    }
}