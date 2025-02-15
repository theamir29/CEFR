package com.example.cefr

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.cefr.databinding.FragmentSpeakingBinding
import com.example.cefr.view.MainActivity

class SpeakingFragment : Fragment(R.layout.fragment_speaking) {

    private lateinit var binding: FragmentSpeakingBinding
    private val navArgs by navArgs<SpeakingFragmentArgs>()
    private lateinit var mainActivity: MainActivity
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSpeakingBinding.bind(view)

        binding.tvTitle.text = navArgs.title

        initVariables()

        binding.icBack.setOnClickListener {
            findNavController().popBackStack()
        }

    }

    private fun initVariables() {
        mainActivity = requireActivity() as MainActivity
        mainActivity.settingsBottomNavigation(false)
        mainActivity.settingsBottomNavigationStudent(false)
    }


    override fun onDestroy() {
        super.onDestroy()
        mainActivity.settingsBottomNavigation(false)
        mainActivity.settingsBottomNavigationStudent(true)
    }
}