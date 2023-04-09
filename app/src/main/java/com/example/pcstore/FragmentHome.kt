package com.example.pcstore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pcstore.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    lateinit var binding: FragmentHomeBinding

    lateinit var adapter: VideoCardAdapter
    val navController by lazy { findNavController() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rw = requireActivity().findViewById<RecyclerView>(R.id.rv)

        adapter = VideoCardAdapter(requireContext()) { videoCard, position ->
            Toast.makeText(requireContext(), "${videoCard.model}", Toast.LENGTH_SHORT).show()}

        adapter.setNewData(createVideoCard())
        rw.adapter = adapter

    }
}