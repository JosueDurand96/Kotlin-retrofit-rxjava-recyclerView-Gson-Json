package com.example.kotlin_retrofit_rxjava_recyclerview_gson_json

import android.database.Observable
import com.example.kotlin_retrofit_rxjava_recyclerview_gson_json.data.MovieResponse
import retrofit2.http.GET

interface ApiMovies {
    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies(): Observable<MovieResponse>?
}