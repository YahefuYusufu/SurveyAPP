package com.example.jetsurvey.signinsignup

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetsurvey.signinsignup.viewModel.SignInViewModel
import com.example.jetsurvey.signinsignup.viewModel.SignInViewModelFactory

@Composable
fun SignInRoute(
    email: String?,
    onSignInSubmitted: () -> Unit,
    onSignInAsGuest: () -> Unit,
    onNavUp: () -> Unit,
) {
    val signInViewModel: SignInViewModel = viewModel(factory = SignInViewModelFactory())

}