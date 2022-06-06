package com.muzafferatmaca.artbooktesting.view

import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.muzafferatmaca.artbooktesting.R
import com.muzafferatmaca.artbooktesting.databinding.FragmentArtDetailsBinding

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
class ArtDetailFragment : Fragment(R.layout.fragment_art_details) {

    private var fragmentBinding: FragmentArtDetailsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentArtDetailsBinding.bind(view)
        fragmentBinding = binding

        binding.artImageView.setOnClickListener {
            findNavController().navigate(ArtFragmentDirections.actionArtFragmentToArtDetailFragment())
        }

        val callBack = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                findNavController().popBackStack()

            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callBack)
    }

    override fun onDestroy() {
        fragmentBinding = null
        super.onDestroy()
    }


}