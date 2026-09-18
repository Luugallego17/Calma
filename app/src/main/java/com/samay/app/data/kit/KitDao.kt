package com.samay.app.data.kit

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface KitDao {

    /** Observa todos los kits (para KitSettings / multi-kit Premium). */
    @Query("SELECT * FROM kit ORDER BY createdAt DESC")
    fun observeKits(): Flow<List<Kit>>

    /** Observa el kit activo (el más reciente). Therapy (P4) lo consume. */
    @Query("SELECT * FROM kit ORDER BY createdAt DESC LIMIT 1")
    fun observeActiveKit(): Flow<Kit?>

    @Query("SELECT * FROM kit WHERE id = :id")
    suspend fun getById(id: Long): Kit?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(kit: Kit): Long

    @Upsert
    suspend fun upsert(kit: Kit)

    @Delete
    suspend fun delete(kit: Kit)

    @Query("DELETE FROM kit")
    suspend fun clear()
}
