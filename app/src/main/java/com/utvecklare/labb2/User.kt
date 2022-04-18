package com.utvecklare.labb2

data class User (
    val Email: String,
    val Password: String
) {
    object email {
        val email: String
            get() {
                TODO()
            }

    }
    object password{
        val password: String
        get(){
            TODO()
        }
    }
}