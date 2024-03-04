package com.example.weather_app_using_api.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weather_app_using_api.Repository.CityRepository
import com.example.weather_app_using_api.Server.ApiClient
import com.example.weather_app_using_api.Server.ApiServices

class CityViewModel(val repository: CityRepository) :ViewModel() {
    constructor() :this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) = repository.getCities(q, limit)
}