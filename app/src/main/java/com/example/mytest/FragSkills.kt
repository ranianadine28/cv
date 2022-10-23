package com.example.mytest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast


class FragSkills : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_frag_skills, container, false)
        val android = view.findViewById<SeekBar>(R.id.sk1)
        val ios = view.findViewById<SeekBar>(R.id.sk2)
        val flutter = view.findViewById<SeekBar>(R.id.sk3)
        var progandVal = 0
        var progiosval = 0
        var progflutterval = 0
        val seekiosVal = view.findViewById<TextView>(R.id.tAnd)
        val seekandval = view.findViewById<TextView>(R.id.tIos)
        val seekFlutterVal = view.findViewById<TextView>(R.id.tFlut)
        val data = arguments
        if (data != null) {
            if (data.getString("sk1") != null) {
                android.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(
                        seekBar: SeekBar,
                        progress: Int,
                        fromUser: Boolean
                    ) {
                        // Write code to perform some action when progress is changed.
                        seekandval.setText(progress.toString())
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar) {
                        // Write code to perform some action when touch is started.

                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar) {
                        // Write code to perform some action when touch is stopped.
                        progandVal = seekBar.progress
                        Toast.makeText(
                            context?.let { it },
                            "Android Progress is " + seekBar.progress + "%",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                })
            }

            if (data.getString("sk2") != null) {
                ios.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(
                        seekBar: SeekBar,
                        progress: Int,
                        fromUser: Boolean
                    ) {
                        // Write code to perform some action when progress is changed.
                        seekandval.setText(progress.toString())
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar) {
                        // Write code to perform some action when touch is started.

                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar) {
                        // Write code to perform some action when touch is stopped.
                        progandVal = seekBar.progress
                        Toast.makeText(
                            context?.let { it },
                            "Android Progress is " + seekBar.progress + "%",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                })
            }
            if (data.getString("sk3") != null) {
                flutter.setOnSeekBarChangeListener(object :
                    SeekBar.OnSeekBarChangeListener {
                    override fun onProgressChanged(
                        seekBar: SeekBar,
                        progress: Int,
                        fromUser: Boolean
                    ) {
                        // Write code to perform some action when progress is changed.
                        seekandval.setText(progress.toString())
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar) {
                        // Write code to perform some action when touch is started.

                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar) {
                        // Write code to perform some action when touch is stopped.
                        progandVal = seekBar.progress
                        Toast.makeText(
                            context?.let { it },
                            "Android Progress is " + seekBar.progress + "%",
                            Toast.LENGTH_SHORT
                        ).show()
                    }


                })
            }


        }
    return view
    }
}



