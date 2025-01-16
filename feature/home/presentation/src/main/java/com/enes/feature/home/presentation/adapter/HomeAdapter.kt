package com.enes.feature.home.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.enes.feature.home.domain.entity.GetAllCharacterResponseModelEntity
import com.enes.feature.home.presentation.databinding.ItemHomeBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHarryPotterHolder>() {

    private var list: List<GetAllCharacterResponseModelEntity> = emptyList()
    private var setItemClickListener: (GetAllCharacterResponseModelEntity) -> Unit = {}

    inner class ViewHarryPotterHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: GetAllCharacterResponseModelEntity) = with(binding) {
            title.text = item.name
            subtitleFirst.text = item.house
            subtitleSecond.text = item.actor
            imageView.load(item.image)
            root.setOnClickListener { setItemClickListener.invoke(item) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHarryPotterHolder {
        return ViewHarryPotterHolder(
            ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHarryPotterHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    fun submitList(newList: List<GetAllCharacterResponseModelEntity>) {
        list = newList
        notifyDataSetChanged()
    }

    fun setItemClickListener(listener: (GetAllCharacterResponseModelEntity) -> Unit) {
        setItemClickListener = listener
    }
}