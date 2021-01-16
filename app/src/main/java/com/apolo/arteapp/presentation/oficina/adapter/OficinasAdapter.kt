package com.apolo.arteapp.presentation.oficina.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apolo.arteapp.R


class OficinasAdapter (val oficinasList : List<String>) : RecyclerView.Adapter<OficinasAdapter.OficinaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OficinaViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.oficina_view_holder,
                parent, false
            )

        return OficinaViewHolder(view)
    }

    override fun getItemCount() = oficinasList.size

    override fun onBindViewHolder(holder: OficinaViewHolder, position: Int) {
        holder.bind(oficinasList[position])
    }

    public class OficinaViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        fun bind(oficina : String) {

        }
    }
}