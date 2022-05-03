package com.doubleclick.Model

import kotlinx.serialization.Serializable

@Serializable
data class UserRespons(val name:String,val email:String) {
    override fun toString(): String {
        return "UserRespons(name='$name', email='$email')"
    }
}
