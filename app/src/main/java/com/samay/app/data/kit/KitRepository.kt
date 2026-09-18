package com.samay.app.data.kit

import kotlinx.coroutines.flow.Flow

/**
 * Contrato de acceso al kit (expuesto según README §6.E).
 * P4 (Therapy) depende solo de esta interfaz; en debug/preview se usa FakeKitRepository.
 */
interface KitRepository {
    fun observeKits(): Flow<List<Kit>>
    fun observeActiveKit(): Flow<Kit?>
    suspend fun getById(id: Long): Kit?
    suspend fun saveKit(kit: Kit): Long
    suspend fun deleteKit(kit: Kit)
    suspend fun clear()
}

/** Implementación real sobre Room. */
class RoomKitRepository(private val dao: KitDao) : KitRepository {
    override fun observeKits(): Flow<List<Kit>> = dao.observeKits()
    override fun observeActiveKit(): Flow<Kit?> = dao.observeActiveKit()
    override suspend fun getById(id: Long): Kit? = dao.getById(id)
    override suspend fun saveKit(kit: Kit): Long = dao.insert(kit)
    override suspend fun deleteKit(kit: Kit) = dao.delete(kit)
    override suspend fun clear() = dao.clear()
}
