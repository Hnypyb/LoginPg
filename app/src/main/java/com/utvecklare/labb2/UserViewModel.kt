package com.utvecklare.labb2

import androidx.lifecycle.ViewModel
import com.utvecklare.labb2.User.email as userEmail
import com.utvecklare.labb2.User.password as userPassword

class UserViewModel:ViewModel() {

    var email: String = ""
    private var userArray = arrayListOf<User> (User ("hani@gmaail.com" , "abd"))

    fun isValidUser(user: User): Boolean {
        var isValid = false
        for (usr in userArray) {
            if (!(userEmail != userEmail || userPassword != userPassword))
            {
                isValid = true
                break
            }
        }
        return isValid
    }
}