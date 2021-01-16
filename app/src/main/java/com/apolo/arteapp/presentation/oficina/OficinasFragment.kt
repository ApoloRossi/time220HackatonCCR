package com.apolo.arteapp.presentation.oficina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.apolo.arteapp.R
import com.apolo.arteapp.presentation.talentos.TalentosFragment

class OficinasFragment : Fragment() {

    companion object {
        fun newInstance() = OficinasFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_oficinas, container, false)

    }
}