package com.chulpash.abonsam.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
//import androidx.room.ColumnInfo

@Entity(tableName = "clients")

data class ClientDbModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String
)