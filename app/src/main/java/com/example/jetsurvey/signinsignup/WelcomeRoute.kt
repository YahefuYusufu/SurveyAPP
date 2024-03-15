package com.example.jetsurvey.signinsignup

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetsurvey.signinsignup.viewModel.WelcomeViewModel
import com.example.jetsurvey.signinsignup.viewModel.WelcomeViewModelFactory

@Composable
fun WelcomeRoute(
    onNavigateToSignIn: () -> Unit,
    onNavigateToSignUp: () -> Unit,
    onSignInAsGuest: () -> Unit,
) {
    val welcomeViewModel: WelcomeViewModel = viewModel(factory = WelcomeViewModelFactory())
}