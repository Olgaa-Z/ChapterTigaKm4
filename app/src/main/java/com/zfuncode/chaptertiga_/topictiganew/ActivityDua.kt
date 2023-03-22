package com.zfuncode.chaptertiga_.topictiganew

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zfuncode.chaptertiga_.R
import com.zfuncode.chaptertiga_.databinding.ActivityDuaBinding

class ActivityDua : AppCompatActivity() {
    lateinit var binding : ActivityDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWeb.setOnClickListener {
            val move = Intent(Intent.ACTION_VIEW)
            move.data = Uri.parse("https://www.binaracademy.com/")
            startActivity(move)
        }

        binding.btnCall.setOnClickListener {
            val cal = Intent(Intent.ACTION_CALL)
            cal.data = Uri.parse("+6285761990862")
            startActivity(cal)
        }

//        ambil data nama
        val getbundle = intent.extras
        val name = getbundle?.getString("nama") //ze
        val age = getbundle?.getInt("umur")
        binding.txtName.text = "Haloo, " +  name + " Umur : $age"

//        get Data Student Serializable
        val getDataStudent = intent.getSerializableExtra("DATASTUDENT") as StudentAndroid
        val nama = getDataStudent.name
        val nim = getDataStudent.nim
        val email = getDataStudent.email

        binding.txtName.text = getDataStudent.name



    }
}