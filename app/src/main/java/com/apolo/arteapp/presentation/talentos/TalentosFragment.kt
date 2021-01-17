package com.apolo.arteapp.presentation.talentos

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.apolo.arteapp.R
import com.apolo.arteapp.presentation.oficina.OficinaDetailsActivity
import com.apolo.arteapp.presentation.oficina.adapter.OficinasAdapter
import com.apolo.arteapp.util.MockDataUtil

class TalentosFragment : Fragment() {


    lateinit var artistRecyclerList : RecyclerView

    companion object {
        fun newInstance() = TalentosFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val layout = inflater.inflate(R.layout.fragment_talentos, container, false)

        artistRecyclerList = layout.findViewById(R.id.artists_list)


        return layout
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        artistRecyclerList.adapter = OficinasAdapter(MockDataUtil.getArtistsList()) { oficina ->
            val intent = Intent(requireContext(), OficinaDetailsActivity::class.java)
            intent.putExtra("oficina", oficina)

            startActivity(intent)
        }

        artistRecyclerList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

    }
}