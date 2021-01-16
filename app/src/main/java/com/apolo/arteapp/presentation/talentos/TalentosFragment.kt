package com.apolo.arteapp.presentation.talentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.apolo.arteapp.R

class TalentosFragment : Fragment() {

    companion object {
        fun newInstance() = TalentosFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_talentos, container, false)
    }
}