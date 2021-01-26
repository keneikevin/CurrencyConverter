package com.example.currencyConverter.main

import com.example.currencyConverter.data.models.CurrencyResponse
import com.example.currencyConverter.util.Resource

interface MainRepository{
    suspend fun getRates(base: String) :Resource<CurrencyResponse>
}