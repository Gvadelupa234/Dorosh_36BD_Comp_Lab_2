package com.example.pcstore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pcstore.databinding.ItemGpuBinding
import android.content.Context
import android.os.Bundle
import androidx.navigation.findNavController
class VideoCardAdapter(val context: Context, val onClick: (model: VideoCard, position: Int) -> Unit,
) : RecyclerView.Adapter<VideoCardAdapter.VideoCardHolder>() {

    private val list = ArrayList<VideoCard>()

    inner class VideoCardHolder(val binding:ItemGpuBinding):RecyclerView.ViewHolder(binding.root) {

        fun bindView(videoCard: VideoCard, position: Int) {
            binding.gpuModel.text = videoCard.model
            binding.gpuShortDetails.text = videoCard.description
            Glide.with(binding.gpuImage)
                .load(videoCard.photoId)
                .into(binding.gpuImage)
            binding.buttonDetails.setOnClickListener {
                onClick(videoCard, position)
                val navController = binding.root.findNavController()
                val bundle = Bundle()
                bundle.putString("Model", " ${videoCard.model}")
                bundle.putString("Price", "Ціна: ${videoCard.price} Грн")
                bundle.putString("Memory", "Пам'ять: ${videoCard.memory} Gb")
                bundle.putString("MemoryType", "Тип пам'яті: ${videoCard.memoryType}")
                bundle.putString("InterfaceType", "Тип інтерфейсу: ${videoCard.interfaceType}")
                bundle.putString("GpuManufacturer", "Виробник графічного процесора: ${videoCard.gpuManufacturer}")
                bundle.putString("DescriptionLong", "Платформа для творчості: ${videoCard.descriptionLong}")
                navController.navigate(R.id.action_fragmentHome2_to_fragmentGpu1, bundle)
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoCardHolder {
        val view = ItemGpuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VideoCardHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VideoCardHolder, position: Int) {
        val videoCard = list[position]
        holder.bindView(videoCard, position)
    }

    fun setNewData(newList: List<VideoCard>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}