package org.bodeen.recipebuilder.api

import org.bodeen.recipebuilder.api.model.FoodSearchResult
import org.bodeen.recipebuilder.api.model.foodreport.FoodReportJSONObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface USDAService {

    @GET("search/?format=json&sort=r&max=25")
    fun searchForIngredient(@Query("q") query: String, @Query("offset") offset: Int, @Query("api_key") apiKey: String = "DEMO_KEY"): Call<FoodSearchResult>

    @GET("V2/reports?type=f&format=json")
    fun retrieveIngredientReport(@Query("ndbno") query: String, @Query("api_key") apiKey: String = "DEMO_KEY"): Call<FoodReportJSONObject>
}