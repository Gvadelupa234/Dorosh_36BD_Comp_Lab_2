package com.example.pcstore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pcstore.databinding.FragmentGpu1Binding
import com.example.pcstore.databinding.FragmentHomeBinding



class FragmentGpu1 : Fragment() {
    private var model: String? = null
    private var price: String? = null
    private var memory: String? = null
    private var memoryType: String? = null
    private var interfaceType: String? = null
    private var gpuManufacturer: String? = null
    private var description: String? = null


    lateinit var binding: FragmentGpu1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGpu1Binding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
             model = it.getString("Model")
             price = it.getString("Price")
             memory = it.getString("Memory")
             memoryType = it.getString("MemoryType")
             interfaceType = it.getString("InterfaceType")
             gpuManufacturer = it.getString("GpuManufacturer")
             description = it.getString("DescriptionLong")


        }

        binding.modelGpuText.text = model
        binding.priceGpuText.text = price
        binding.memoryGpuText.text = memory
        binding.memoryTypeText.text = memoryType
        binding.interfaceTypeText.text = interfaceType
        binding.gpuManufacturerText.text = gpuManufacturer
        binding.descriptionLongText.text = description

    }


}