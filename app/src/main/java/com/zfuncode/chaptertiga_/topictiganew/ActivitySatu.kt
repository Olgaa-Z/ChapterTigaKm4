package com.zfuncode.chaptertiga_.topictiganew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga_.R
import com.zfuncode.chaptertiga_.databinding.ActivitySatuBinding

class ActivitySatu : AppCompatActivity() {
    lateinit var binding : ActivitySatuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSatu.setOnClickListener {
            val namastudent = binding.etName.text.toString()
            val bundle = Bundle()
            val move = Intent(this, ActivityDua::class.java)
            bundle.putString("nama", namastudent)
            bundle.putInt("umur", 20)
            move.putExtras(bundle)
            startActivity(move)
        }

//        another version
        val bund = Bundle().apply {
            putString("name", "Andika")
            putInt("age", 21)
            putBoolean("student", true)
        }
        val pindah = Intent(this, ActivityDua::class.java).apply {
            putExtra("data", bund)
        }
        startActivity(pindah)

//        Serializable
        binding.btnSerial.setOnClickListener {
            val dataStudent = StudentAndroid("Iki","76274","iki@gmail.com")
            val move = Intent(this, ActivityDua::class.java)
            move.putExtra("DATASTUDENT", dataStudent)
            startActivity(move)
        }
    }

}