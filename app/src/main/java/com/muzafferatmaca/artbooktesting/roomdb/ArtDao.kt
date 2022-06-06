package com.muzafferatmaca.artbooktesting.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
@Dao
interface ArtDao  {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArt(art : Art)

    @Delete
    suspend fun deleteArt(art : Art)

    @Query("SELECT * FROM arts")
    fun observeArts(): LiveData<List<Art>>

}