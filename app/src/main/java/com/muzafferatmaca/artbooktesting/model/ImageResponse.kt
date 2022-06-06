package com.muzafferatmaca.artbooktesting.model

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
data class ImageResponse(
    val hits : List<ImageResult>,
    val total : Int,
    val totalHits : Int
)
