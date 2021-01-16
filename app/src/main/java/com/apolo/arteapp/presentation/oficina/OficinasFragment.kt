package com.apolo.arteapp.presentation.oficina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.apolo.arteapp.R
import com.apolo.arteapp.presentation.oficina.adapter.OficinasAdapter
import com.apolo.arteapp.presentation.talentos.TalentosFragment

class OficinasFragment : Fragment() {

    companion object {
        fun newInstance() = OficinasFragment()
    }

    lateinit var oficinasRecyclerList : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val oficinaLayout = inflater.inflate(R.layout.fragment_oficinas, container, false)
        oficinasRecyclerList = oficinaLayout.findViewById(R.id.oficinas_list)

        return oficinaLayout

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        oficinasRecyclerList.adapter = OficinasAdapter(listOf("Apolo", "Apolo","Apolo","Apolo","Apolo","Apolo","Apolo"))

        oficinasRecyclerList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)


    }
}