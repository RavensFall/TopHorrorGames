package com.example.tophorrorgames


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tophorrorgames.databinding.HorrorItemBinding

class HorrorAdapter(var array : List<ItemHorror>,var proceed:(ItemHorror)->Unit) : RecyclerView.Adapter<HorrorAdapter.HorrorViewHolder>() {
    inner class HorrorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding = HorrorItemBinding.bind(view)
        fun bind(item: ItemHorror) {
            binding.CurrentText.text = item.name

            Glide
                .with(binding.root)
                .load(item.image)
                .centerCrop()
                .into(binding.CurrentImage);

            binding.RecViewElement.setOnClickListener{
                proceed(array[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorrorViewHolder {
        var inflater = LayoutInflater.from(parent.context)
        val binding = inflater.inflate(R.layout.horror_item, parent, false)
        return HorrorViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: HorrorViewHolder, position: Int) {
        holder.bind(array[position])
    }
}