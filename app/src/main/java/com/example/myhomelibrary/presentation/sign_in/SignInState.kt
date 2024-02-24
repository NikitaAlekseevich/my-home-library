package com.example.myhomelibrary.presentation.sign_in

data class SignInState(
    val isSignSuccessful: Boolean = false,
    val signInError: String? = null
)
