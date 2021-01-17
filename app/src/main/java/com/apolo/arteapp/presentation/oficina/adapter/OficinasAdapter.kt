package com.apolo.arteapp.presentation.oficina.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apolo.arteapp.R


class OficinasAdapter (val oficinasList : List<String>, val onOficinaClick: (oficina : String) -> Unit) : RecyclerView.Adapter<OficinasAdapter.OficinaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OficinaViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.oficina_view_holder,
                parent, false
            )

        return OficinaViewHolder(view, onOficinaClick)
    }

    override fun getItemCount() = oficinasList.size

    override fun onBindViewHolder(holder: OficinaViewHolder, position: Int) {
        holder.bind(oficinasList[position])
    }

    public class OficinaViewHolder(val view : View, val onOficinaClick: (oficina : String) -> Unit) : RecyclerView.ViewHolder(view) {

        fun bind(oficina : String) {
            val showDetailsButton = view.findViewById<TextView>(R.id.show_details_button)
            showDetailsButton.setOnClickListener {
                onOficinaClick(oficina)
            }
        }
    }
}