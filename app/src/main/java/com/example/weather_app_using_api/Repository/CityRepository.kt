package com.example.weather_app_using_api.Repository

import com.example.weather_app_using_api.Server.ApiServices

class CityRepository(val api: ApiServices) {
    fun getCities(q: String, limit: Int) = api.getCitiesList(q, limit, "b76b93e4b608f82320fc1db758992444")
}