package com.example.kotlin_retrofit_rxjava_recyclerview_gson_json

import android.database.Observable
import com.example.kotlin_retrofit_rxjava_recyclerview_gson_json.data.MovieResponse

interface ApiMovies {
    fun getMovies(): Observable<MovieResponse>
}