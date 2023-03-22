package com.zfuncode.chaptertiga_.topicdua

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.zfuncode.chaptertiga_.R
import kotlinx.android.synthetic.main.activity_implicit.*

class ImplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)

        btnGallery.setOnClickListener{
            val pindah = Intent(Intent.ACTION_VIEW)
            pindah.data = Uri.parse("content://media/external/images/media/")
            startActivity(pindah)
        }

        btnCamera.setOnClickListener{
            val pindah = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(pindah)
        }

        btnWeb.setOnClickListener{
            val pindah = Intent(Intent.ACTION_VIEW)
            pindah.data = Uri.parse("https://www.binaracademy.com/")
            startActivity(pindah)
        }










    }


}