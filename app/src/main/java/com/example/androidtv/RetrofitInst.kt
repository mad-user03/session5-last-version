package com.example.androidtv

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInst {
    const val BASEURL = "http://cinema.areas.su/movies?filter=new"

    val retrofit by lazy {
        Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build()
    }
//    val api : RetrofitInterface by lazy{    }
}