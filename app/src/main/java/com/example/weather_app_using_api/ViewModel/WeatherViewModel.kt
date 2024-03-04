package com.example.weather_app_using_api.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weather_app_using_api.Repository.WeatherRepository
import com.example.weather_app_using_api.Server.ApiClient
import com.example.weather_app_using_api.Server.ApiServices

class WeatherViewModel(val repository: WeatherRepository):ViewModel() {
    constructor(): this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat: Double, lng: Double, unit: String) =
        repository.getCurrentWeather(lat, lng, unit)

    fun loadForecastWeather(lat: Double, lng: Double, unit: String) =
        repository.getForecastWeather(lat, lng, unit)
}