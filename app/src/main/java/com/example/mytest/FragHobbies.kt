package com.example.mytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [FragHobbies.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragHobbies : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View =inflater.inflate(R.layout.fragment_frag_hobbies, container, false);
        val music=view.findViewById<CheckBox>(R.id.cb1)
        val sport=view.findViewById<CheckBox>(R.id.cb2)
        val game=view.findViewById<CheckBox>(R.id.cb3)
        val data=arguments

        if(data!=null){
            if(data.getString("sport")!=null){
                sport.isChecked=true
            }
            if(data.getString("music")!=null){
                music.isChecked=true;
            }

            if(data.getString("game")!=null){
                game.isChecked=true;
            }
        }

return view
    }


}