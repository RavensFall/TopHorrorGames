package com.example.tophorrorgames

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.tophorrorgames.databinding.FragmentHorrorInfoBinding
import com.example.tophorrorgames.databinding.FragmentHorrorListBinding

class HorrorInfoFragment : Fragment(R.layout.fragment_horror_info) {
    val args: HorrorInfoFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding= FragmentHorrorInfoBinding.bind(view)
        val itemHorror = args.itemhorror
        binding.name.text = itemHorror.name
        Glide.with(binding.root).load(itemHorror.image).into(binding.image)
        binding.released.text = itemHorror.released
        binding.rating.text = itemHorror.rating
        binding.platform.text = itemHorror.platform
        binding.developer.text = itemHorror.developer
        binding.descript.text = itemHorror.descript

    }




}