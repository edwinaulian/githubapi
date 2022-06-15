package com.example.githubapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.githubapi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         binding.rvUser.setOnClickListener(
             Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_detailFragment)
         )
//       binding.rvUser.setOnClickListener { view ->
//           view.findNavController().navigate(R.id.action_homeFragment_to_mainActivity)
//       }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}