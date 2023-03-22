package com.zfuncode.chaptertiga_.topicempat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.zfuncode.chaptertiga_.R
import kotlinx.android.synthetic.main.fragment_tiga.*

class FragmentTiga : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMain.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentTiga_to_fragmentSatu)
        }

//        mengambil data dari fragment 2
        var getUmur = arguments?.getString("dataumur")
//        set data umur kedalam textview
        txtGetUmur.text = getUmur

//        membujat toast
        Toast.makeText(context, getUmur, Toast.LENGTH_SHORT).show()



    }


}