package com.example.mytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragTot.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragTot : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_frag_tot, container, false)
        val name=view.findViewById<TextView>(R.id.nam)
        val age=view.findViewById<TextView>(R.id.age)
        val email=view.findViewById<TextView>(R.id.emai)
        val gender=view.findViewById<TextView>(R.id.gen)
        val iosSkills=view.findViewById<TextView>(R.id.ios)
        val androidSkills=view.findViewById<TextView>(R.id.android)
        val flutterSkills=view.findViewById<TextView>(R.id.flutter)
        val hobbies=view.findViewById<TextView>(R.id.hob)
        val languages=view.findViewById<TextView>(R.id.lan)
        val data=arguments;

        if(data != null){
            name.text=data.getString("nam");
            age.text=data.getString("age");
            gender.text=data.getString("genre");
            email.text=data.getString("email")
        }



        return view
    }


}