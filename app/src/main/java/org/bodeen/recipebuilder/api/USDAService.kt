package org.bodeen.recipebuilder.api

import org.bodeen.recipebuilder.api.model.FoodSearchResult
import org.bodeen.recipebuilder.api.model.foodreport.FoodReportJSONObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface USDAService {

    @GET("search/?format=json&sort=r&max=25")
    fun searchForIngredient(@Query("q") query: String, @Query("offset") offset: Int, @Query("api_key") apiKey: String = "DEMO_KEY"): Call<FoodSearchResult>

    @GET("search/?format=json&sort=r&max=25")
    fun searchForIngredientWithFoodGroup(@Query("q") query: String, @Query("offset") offset: Int, @Query("fg") group: String,@Query("api_key") apiKey: String = "DEMO_KEY"): Call<FoodSearchResult>

    @GET("search/?format=json&sort=r&max=25&fg=0100&fg=0200&fg=0400&fg=0500&fg=0900&fg=1000&fg=1100&fg=1200&fg=1300&fg=1500&fg=1600&fg=1700&fg=2000")
    fun searchForIngredientCulled(@Query("q") query: String, @Query("offset") offset: Int, @Query("fg") group: String,@Query("api_key") apiKey: String = "DEMO_KEY"): Call<FoodSearchResult>

    @GET("V2/reports?type=f&format=json")
    fun retrieveIngredientReport(@Query("ndbno") ndbno: String, @Query("api_key") apiKey: String = "DEMO_KEY"): Call<FoodReportJSONObject>
}