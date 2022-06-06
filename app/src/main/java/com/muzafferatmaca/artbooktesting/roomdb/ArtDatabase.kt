package com.muzafferatmaca.artbooktesting.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
@Database(entities = [Art::class], version = 1)
abstract class ArtDatabase : RoomDatabase(){

    abstract fun artDao() : ArtDao


}