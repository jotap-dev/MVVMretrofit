package com.example.mvvm.repositories

import com.example.mvvm.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllLives() = retrofitService.getAllLives()

}