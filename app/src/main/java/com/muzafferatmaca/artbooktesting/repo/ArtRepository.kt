package com.muzafferatmaca.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.muzafferatmaca.artbooktesting.api.RetrofitAPI
import com.muzafferatmaca.artbooktesting.model.ImageResponse
import com.muzafferatmaca.artbooktesting.roomdb.Art
import com.muzafferatmaca.artbooktesting.roomdb.ArtDao
import com.muzafferatmaca.artbooktesting.util.Resource
import javax.inject.Inject

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
class ArtRepository @Inject constructor(
    private val artDao: ArtDao,
    private val retrofitAPI: RetrofitAPI
) : ArtRepositoryInterface {

    override suspend fun insertArt(art: Art) {
        artDao.insertArt(art)
    }

    override suspend fun deleteArt(art: Art) {
        artDao.deleteArt(art)
    }

    override fun getArt(): LiveData<List<Art>> {
        return artDao.observeArts()
    }

    override suspend fun searchImage(imageString: String): Resource<ImageResponse> {
        return try {
            val response = retrofitAPI.imageSearch(imageString)
            if (response.isSuccessful) {
                response.body()?.let {
                    return@let Resource.success(it)
                } ?: Resource.error("error", null)
            } else {
                Resource.error("error", null)
            }
        } catch (e: Exception) {

            Resource.error("No data", null)

        }
    }


}