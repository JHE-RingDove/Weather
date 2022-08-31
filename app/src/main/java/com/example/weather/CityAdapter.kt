package com.example.weather

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso





class CityAdapter(private val cities: Array<City>) : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    // Describes an item view and its place within the RecyclerView
    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val cityTextView: TextView = itemView.findViewById(R.id.city_text)
        private val cityDView: TextView = itemView.findViewById(R.id.city_d)
        private val cityImageView: ImageView = itemView.findViewById(R.id.city_image)

        fun bind(name: String, d : String, pic : String) {
            cityTextView.text = name
            cityDView.text = d
            Picasso.get()
                .load(pic)
//                .resize(48, 48)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .into(cityImageView)

//            cityImageView.setImageResource(R.drawable.ic_launcher_foreground)
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.city, parent, false)

        return CityViewHolder(view)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return cities.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.bind(cities[position].name, cities[position].degrees, cities[position].pic)
    }


}