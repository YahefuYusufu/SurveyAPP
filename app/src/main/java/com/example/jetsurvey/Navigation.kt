package com.example.jetsurvey

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetsurvey.Destination.SIGN_IN_ROUTE
import com.example.jetsurvey.Destination.SIGN_UP_ROUTE
import com.example.jetsurvey.Destination.WELCOME_ROUTE
import com.example.jetsurvey.signinsignup.SignInRoute
import com.example.jetsurvey.signinsignup.SignUpRoute
import com.example.jetsurvey.signinsignup.WelcomeRoute

object Destination {
    const val WELCOME_ROUTE = "welcome"
    const val SIGN_UP_ROUTE = "signup/{email}"
    const val SIGN_IN_ROUTE = "signin/{email}"
    const val SURVEY_ROUTE = "survey"

}

@Composable
fun JetsurveyNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = WELCOME_ROUTE,
    ) {
        composable(WELCOME_ROUTE) {
            WelcomeRoute(
                onNavigateToSignIn = {
                    navController.navigate("signin/$it")
                },
                onNavigateToSignUp = {
                    navController.navigate("signup/$it")
                },
                onSignInAsGuest = {
                    navController.navigate("signup/$it")
                },
            )
        }

        composable(SIGN_IN_ROUTE) {
            SignInRoute()
        }

        composable(SIGN_UP_ROUTE) {

            SignUpRoute()

        }
    }
    }
