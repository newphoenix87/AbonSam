package com.chulpash.abonsam.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ClientsInfoDao {

    @Query("SELECT * FROM clients")
    fun allClients():LiveData<List<ClientDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClient(client:ClientDbModel)

}