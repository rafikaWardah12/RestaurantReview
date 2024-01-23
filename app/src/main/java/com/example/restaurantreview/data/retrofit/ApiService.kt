package com.example.restaurantreview.data.retrofit

import com.example.restaurantreview.data.response.RestaurantResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): retrofit2.Call<RestaurantResponse>
}