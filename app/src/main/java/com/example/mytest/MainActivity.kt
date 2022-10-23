package com.example.mytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var n1 : TextInputLayout
    lateinit var  n : TextInputEditText
    lateinit var e1 : TextInputLayout
    lateinit var  e : TextInputEditText
    lateinit var a1 : TextInputLayout
    lateinit var  a : TextInputEditText
    lateinit var  b1: RadioButton
    lateinit var  b2 : RadioButton
    lateinit var  b : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        n1=findViewById(R.id.name1)
        n=findViewById(R.id.name)
        e1=findViewById(R.id.email1)
        e=findViewById(R.id.email)
        a1=findViewById(R.id.phone1)
        a=findViewById(R.id.phone)
        b1=findViewById(R.id.g1)
        b2=findViewById(R.id.g2)
        b=findViewById(R.id.next)
        b.setOnClickListener(){

            val i = Intent(this,MainActivity2::class.java)


            if (b1.isChecked){
                i.putExtra("rad1", "Male")
            }
            else {
                i.putExtra("rad1", "  ")
            }

            if (b2.isChecked){
                i.putExtra("rad2", "Female")
            }
            else {
                i.putExtra("rad2", " ")
            }

            i.putExtra("hhh", a.text.toString())
            i.putExtra("nnn", n.text.toString())
            i.putExtra("eee", e.text.toString())



            /*if (agee.text.isEmpty() || namee.text.isEmpty() || emaill.text.isEmpty()){
            Toast.makeText(this@MainActivity2, "Check your input ! ", Toast.LENGTH_SHORT).show()
            }else{
              */

            //}
            if (n.text.isNullOrEmpty() || a.text.isNullOrEmpty() || e.text.isNullOrEmpty() ){
                if (n.text.isNullOrEmpty()){
                    n1.error = "Must not be empty!"
                }
                if(a.text.isNullOrEmpty()){
                    a1.error = "Must not be empty!"
                }
                if(e.text.isNullOrEmpty()){
                    e1.error = "Must not be empty!"
                }
            }else {
                startActivity(i)
            }

        }



    }



}