package com.muzafferatmaca.artbooktesting.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.muzafferatmaca.artbooktesting.R
import com.muzafferatmaca.artbooktesting.databinding.FragmentArtsBinding

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
class ArtFragment : Fragment(R.layout.fragment_arts) {

    private var fragmentBinding :FragmentArtsBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentArtsBinding.bind(view)
        fragmentBinding = binding

        binding.fab.setOnClickListener {
            findNavController().navigate(ArtFragmentDirections.actionArtFragmentToArtDetailFragment())

        }

    }

    override fun onDestroy() {
        fragmentBinding = null
        super.onDestroy()

    }

}