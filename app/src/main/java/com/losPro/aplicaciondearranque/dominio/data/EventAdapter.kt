package com.losPro.aplicaciondearranque.dominio.data

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.losPro.aplicaciondearranque.R

class EventAdapter(private val events : List<Event>) :
    RecyclerView.Adapter<EventAdapter.ViewHolder>(){

    class ViewHolder(eventView: View) : RecyclerView.ViewHolder(eventView){

            val id: TextView = eventView.findViewById(R.id.textViewId)
            val date: TextView = eventView.findViewById(R.id.textViewDate)
            val hour: TextView = eventView.findViewById(R.id.textViewHour)
            val place: TextView = eventView.findViewById(R.id.textViewPlace)
            val price: TextView = eventView.findViewById(R.id.textViewPrice)
            val sport: TextView = eventView.findViewById(R.id.textViewSport)
            //val logo: ImageView = eventView.findViewById(R.id.imageViewLogo)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

     val view = LayoutInflater.from(parent.context).inflate(R.layout.event_layout,parent,false)
        return ViewHolder(view)
    }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = events[position]
        holder.id.text = event.id.toString()
        holder.date.text = event.date
        holder.hour.text = event.hour
        holder.place.text = event.place
        holder.price.text = event.price.toString()
        holder.sport.text = event.sport.toString()

     /* Glide.with(holder.logo.context)
          .load(event.sport.logo)
          .into(holder.logo) */
    }

    override fun getItemCount(): Int = events.size
}