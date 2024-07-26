package uz.khusinov.karvon.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
 import android.view.View
import androidx.navigation.fragment.findNavController
import uz.khusinov.karvon.R
import uz.khusinov.karvon.databinding.FragmentNumberConfirmBinding
import uz.khusinov.marjonamarketcourier2.utills.viewBinding

class NumberConfirmFragment : Fragment(R.layout.fragment_number_confirm) {

    private val binding by viewBinding { FragmentNumberConfirmBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {

            confirmButton.setOnClickListener {
                findNavController().navigate(R.id.action_numberConfirmFragment_to_introduction1Fragment)
            }

        }
    }
}