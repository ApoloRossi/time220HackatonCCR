package com.apolo.arteapp.presentation.oficina.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apolo.arteapp.R
import com.apolo.arteapp.data.model.OficinaView
import com.squareup.picasso.Picasso


class OficinasAdapter (val oficinasList : List<OficinaView>, val onOficinaClick: (oficina : OficinaView) -> Unit) : RecyclerView.Adapter<OficinasAdapter.OficinaViewHolder>() {

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

    public class OficinaViewHolder(val view : View, val onOficinaClick: (oficina : OficinaView) -> Unit) : RecyclerView.ViewHolder(view) {

        fun bind(oficina : OficinaView) {
            val title = view.findViewById<TextView>(R.id.title)
            val oficinaType = view.findViewById<TextView>(R.id.oficina_type)
            val picture = view.findViewById<ImageView>(R.id.picture)
            val showDetailsButton = view.findViewById<TextView>(R.id.show_details_button)

            title.text = oficina.title
            oficinaType.text = oficina.artType

            Picasso.get().load(oficina.pictures[0]).into(picture)

            showDetailsButton.setOnClickListener {
                onOficinaClick(oficina)
            }
        }
    }
}