package com.example.animatedbutton2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.animatedbutton2.databinding.ActivityMainBinding
import nl.joery.animatedbottombar.AnimatedBottomBar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragment1 = BlankFragment1()
        val fragment2 = BlankFragment2()
        val fragment3 = BlankFragment3()
        val fragment4 = BlankFragment4()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_main, fragment4)
            commit()
        }
        binding.bottomBar.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
            override fun onTabSelected(
                /**
                 *  0 = home
                 *  1 = alarm
                 *  2 = break
                 *  3 = cart
                 */
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {
                when (newIndex) {
                    0 -> {
                        Log.d("error", "Ini ${newIndex}")
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.fragment_main, fragment1)
                            commit()
                        }
                    }
                    1 -> {
                        Log.d("error", "Ini ${newIndex}")
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.fragment_main, fragment2)
                            commit()
                        }
                    }
                    2 -> {
                        Log.d("error", "Ini ${newIndex}")
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.fragment_main, fragment3)
                            commit()
                        }
                    }
                    3 -> {
                        Log.d("error", "Ini ${newIndex}")
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.fragment_main, fragment4)
                            commit()
                        }
                    }
                }
            }
        })
    }
}