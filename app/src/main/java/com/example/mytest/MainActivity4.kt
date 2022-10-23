package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity4 : AppCompatActivity() {
    private lateinit var btnskill: Button
    private lateinit var btnhob: Button
    private lateinit var btnlang: Button
    private lateinit var btnicon: BottomNavigationView

    //private lateinit var btnh : Button
    var imagePicker: ImageView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btnskill=findViewById(R.id.but1)
        btnhob=findViewById(R.id.but2)
        btnlang=findViewById(R.id.but3)
        btnicon=findViewById(R.id.nav)
        imagePicker=findViewById(R.id.img)
        val f1=FragSkills()
        val f2=FragHobbies()
        val f3=FragLnaguages()
        val f4=FragTot()

        btnskill.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragFl , f1)
                addToBackStack(null)
                commit()
            }
        }
        btnhob.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragFl , f2)
                addToBackStack(null)
                commit()
            }
        }
        btnlang.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragFl , f3)
                addToBackStack(null)
                commit()
            }
        }
        btnicon.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragFl , f4)
                addToBackStack(null)
                commit()
            }
        }
        fun replaceFragment(fragment : Fragment){
            if (fragment != null){
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragFl , fragment)
                transaction.commit()
            }
        }

    }
}