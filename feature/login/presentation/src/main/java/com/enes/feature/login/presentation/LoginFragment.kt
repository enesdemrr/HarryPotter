package com.enes.feature.login.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.enes.common.presentation.BaseFragment
import com.enes.common.presentation.utils.fragmentViewBinding
import com.enes.feature.login.presentation.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : BaseFragment(R.layout.fragment_login) {

    override val binding by fragmentViewBinding(FragmentLoginBinding::bind)
    override val viewModel: LoginViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindUI()
    }

    override fun bindUI() {
        binding.apply {
            button.setOnClickListener {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToHomeFragment())
            }
        }
    }
}