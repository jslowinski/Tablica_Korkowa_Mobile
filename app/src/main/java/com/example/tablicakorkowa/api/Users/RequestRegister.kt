package com.example.tablicakorkowa.api.Users

data class RequestRegister (
    var firstname: String,
    var lastname: String,
    var telephone: String,
    var email: String,
    var accountID: String,
    var avatar: String
)

