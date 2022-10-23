package com.example.mytest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var s1:SeekBar
    lateinit var s2:SeekBar
    lateinit var s3:SeekBar
    lateinit var c1:CheckBox
    lateinit var c2:CheckBox
    lateinit var c3:CheckBox
    lateinit var m:CheckBox
    lateinit var s:CheckBox
    lateinit var g:CheckBox
    lateinit var b: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val nnn:String =intent.getStringExtra("nom").toString();
        val eee:String=intent.getStringExtra("email").toString();
        val hhh:String=intent.getStringExtra("age").toString();

        s1=findViewById(R.id.sb1)
        s2=findViewById(R.id.sb2)
        s3=findViewById(R.id.sb3)
        c1=findViewById(R.id.ce)
        c2=findViewById(R.id.ca)
        c3=findViewById(R.id.cf)
        m=findViewById(R.id.music)
        s=findViewById(R.id.sport)
        g=findViewById(R.id.game)
        b=findViewById(R.id.submit)
        var progandVal=0
        var progiosval=0
        var progflutterval=0
        val seekiosVal=findViewById<TextView>(R.id.textView5)
        val seekandval=findViewById<TextView>(R.id.textView4)
        val seekFlutterVal=findViewById<TextView>(R.id.textView6)

        s1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
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
                    this@MainActivity2,
                    "Android Progress is " + seekBar.progress + "%",
                    Toast.LENGTH_SHORT
                ).show()
            }

        })

        s2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Write code to perform some action when progress is changed.
                seekiosVal.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Write code to perform some action when touch is started.

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Write code to perform some action when touch is stopped.
                progiosval = seekBar.progress
                Toast.makeText(
                    this@MainActivity2,
                    "Ios Progress is " + seekBar.progress + "%",
                    Toast.LENGTH_SHORT
                ).show()
            }

        })

        s3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Write code to perform some action when progress is changed.
                seekFlutterVal.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Write code to perform some action when touch is started.

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Write code to perform some action when touch is stopped.
                progflutterval = seekBar.progress
                Toast.makeText(
                    this@MainActivity2,
                    "Flutter Progress is " + seekBar.progress + "%",
                    Toast.LENGTH_SHORT
                ).show()
            }

        })
        b.setOnClickListener(){

            val i = Intent(this,MainActivity4::class.java)


            if (c1.isChecked){
                i.putExtra("rad1", "english")
            }
            else {
                i.putExtra("rad1", "  ")
            }

            if (c2.isChecked){
                i.putExtra("rad2", "arabic")
            }
            else {
                i.putExtra("rad2", " ")
            }
            if (c3.isChecked){
                i.putExtra("rad3", "french")
            }
            else {
                i.putExtra("rad3", "  ")
            }
            if (m.isChecked){
                i.putExtra("rad4", "music")
            }
            else {
                i.putExtra("rad4", "  ")
            }
            if (s.isChecked){
                i.putExtra("rad5", "sport")
            }
            else {
                i.putExtra("rad5", "  ")
            }
            if (m.isChecked){
                i.putExtra("rad6", "music")
            }
            else {
                i.putExtra("rad6", "  ")
            }

                startActivity(i)
            }

        }




    }
