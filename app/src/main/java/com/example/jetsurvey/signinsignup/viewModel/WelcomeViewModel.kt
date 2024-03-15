package com.example.jetsurvey.signinsignup.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetsurvey.signinsignup.UserRepository

class WelcomeViewModel(
    private val userRepository: UserRepository
) :ViewModel() {

    fun handleContinue() {

    }
    fun signInAsGuest() {

    }
}

class WelcomeViewModelFactory: ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WelcomeViewModel::class.java)) {
            return WelcomeViewModel(UserRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}