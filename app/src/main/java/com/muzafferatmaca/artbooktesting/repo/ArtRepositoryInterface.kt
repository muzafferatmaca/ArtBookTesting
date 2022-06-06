package com.muzafferatmaca.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.muzafferatmaca.artbooktesting.model.ImageResponse
import com.muzafferatmaca.artbooktesting.roomdb.Art
import com.muzafferatmaca.artbooktesting.util.Resource

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art : Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage (imageString: String) : Resource<ImageResponse>



}