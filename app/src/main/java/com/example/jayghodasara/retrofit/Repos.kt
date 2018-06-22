package com.example.jayghodasara.retrofit

import retrofit2.Call
import retrofit2.http.*

interface Repos {

    @GET("/maps/api/place/findplacefromtext/json")
    fun getusers(@Query("input") user: String,
                 @Query("inputtype") input:String,
                 @Query("fields") fields:String,
                 @Query("key") key:String): Call<POJO>

//    @POST("/posts")
//    fun createacc(@Body() post:Postpojo):Call<Postpojo>
}