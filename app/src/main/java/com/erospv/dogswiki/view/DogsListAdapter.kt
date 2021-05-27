package com.erospv.dogswiki.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.erospv.dogswiki.R
import com.erospv.dogswiki.model.DogBreed

class DogsListAdapter(val dogsList: ArrayList<DogBreed>): RecyclerView.Adapter<DogsListAdapter.DogViewHolder>() {

    fun updatesDogsList(newDogsList: List<DogBreed>) {
        dogsList.clear()
        dogsList.addAll(newDogsList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.dog_item, parent,false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.name).text = dogsList[position].dogBreed
        holder.view.findViewById<TextView>(R.id.lifespan).text = dogsList[position].lifeSpan
        holder.view.setOnClickListener {
            Navigation.findNavController(it).navigate(ListFragmentDirections.actionListFragmentToDetailFragment())
        }
    }

    override fun getItemCount(): Int = dogsList.size



    class DogViewHolder (var view: View) : RecyclerView.ViewHolder(view)
}