package com.placesautocomplete.model

import com.placesautocomplete.model.Address


data class PlaceDetails(
    val name: String,
    val address: ArrayList<Address>,
    val lat: Double,
    val lng: Double,
    val placeId: String,
    val url: String,
    val utcOffset: Int,
    val vicinity: String,
    val compoundPlusCode: String,
    val globalPlusCode: String
)