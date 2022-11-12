package iqro.mobile.smartjustice.presenter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import iqro.mobile.smartjustice.databinding.SplashScreenLayoutBinding

/**
 *Created by Zohidjon Akbarov
 */
@AndroidEntryPoint
class EntryScreen : Fragment() {

    private var binding: SplashScreenLayoutBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SplashScreenLayoutBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }
}