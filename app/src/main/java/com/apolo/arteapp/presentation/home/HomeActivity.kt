package com.apolo.arteapp.presentation.home

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.apolo.arteapp.R
import com.apolo.arteapp.presentation.oficina.OficinasFragment
import com.apolo.arteapp.presentation.talentos.TalentosFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    private lateinit var navigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView = findViewById(R.id.navigationView)

        navigationView.setOnNavigationItemSelectedListener(this)

        openFragment(OficinasFragment.newInstance())


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.navigation_artes -> {
                openFragment(TalentosFragment.newInstance())
            }
            else -> {
                openFragment(OficinasFragment.newInstance())
            }
        }

        return true
    }

    private fun openFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }


}