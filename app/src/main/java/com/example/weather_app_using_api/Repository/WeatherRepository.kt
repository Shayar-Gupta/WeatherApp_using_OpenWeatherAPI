package com.example.weather_app_using_api.Repository

import com.example.weather_app_using_api.Server.ApiServices

class WeatherRepository(val api: ApiServices) {
    fun getCurrentWeather(lat: Double, lng: Double, unit: String) =
        api.getCurrentWeather(lat, lng, unit, "b76b93e4b608f82320fc1db758992444")

    fun getForecastWeather(lat: Double, lng: Double, unit: String) =
        api.getForecastWeather(lat, lng, unit, "b76b93e4b608f82320fc1db758992444")
}