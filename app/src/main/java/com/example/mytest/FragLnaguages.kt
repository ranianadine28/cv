package com.example.mytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragLnaguages.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragLnaguages : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_frag_lnaguages, container, false)
        val arabic = view.findViewById<CheckBox>(R.id.cbx1);
        val englich = view.findViewById<CheckBox>(R.id.cbx2);
        val french = view.findViewById<CheckBox>(R.id.cbx3);
        val data = arguments
        if (data != null) {
            if (data.getString("cbx1") != null) {
                arabic.isChecked = true;
            }

            if (data.getString("cbx3") != null) {
                french.isChecked = true;
            }

            if (data.getString("cbx2") != null) {
                englich.isChecked = true;
            }



        }

        return view
    }
}