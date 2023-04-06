package com.example.testcleanarch.data.models

import androidx.room.ColumnInfo

data class UserInfoTuple (
    val id:Long,
    @ColumnInfo(name = "firstName")
    val firstName:String,
    @ColumnInfo(name = "lastName")
    val lastName:String,
    @ColumnInfo(name = "email")
    val email:String,
    @ColumnInfo(name = "password")
    val password:String
    )