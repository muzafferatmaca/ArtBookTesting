package com.muzafferatmaca.artbooktesting.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
@Entity(tableName = "arts")
data class Art(

    var name: String,

    var artistName : String,

    var year: Int,

    var imageUrl : String,

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)

