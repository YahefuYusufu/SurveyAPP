package com.example.jetsurvey

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetsurvey.Destination.SIGN_IN_ROUTE
import com.example.jetsurvey.Destination.SIGN_UP_ROUTE
import com.example.jetsurvey.Destination.SURVEY_ROUTE
import com.example.jetsurvey.Destination.WELCOME_ROUTE
import com.example.jetsurvey.signinsignup.SignInRoute
import com.example.jetsurvey.signinsignup.SignUpRoute
import com.example.jetsurvey.signinsignup.WelcomeRoute

object Destination {
    const val WELCOME_ROUTE = "welcome"
    const val SIGN_UP_ROUTE = "signup/{email}"
    const val SIGN_IN_ROUTE = "signin/{email}"
    const val SURVEY_ROUTE = "survey"
    const val SURVEY_RESULTS_ROUTE = "surveyresults"


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
                    navController.navigate(SURVEY_ROUTE)
                },
            )
        }

        composable(SIGN_IN_ROUTE) {
            val startingEmail = it.arguments?.getString("email")
            SignInRoute(
                email = startingEmail,
                onSignInSubmitted = {
                    navController.navigate(SURVEY_ROUTE)
                },
                onSignInAsGuest = { navController.navigate(SURVEY_ROUTE)},
                onNavUp = navController::navigateUp
            )
        }

        composable(SIGN_UP_ROUTE) {

            SignUpRoute()

        }
    }
    }
