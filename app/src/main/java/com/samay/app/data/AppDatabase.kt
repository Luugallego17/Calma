package com.samay.app.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.samay.app.data.kit.Kit
import com.samay.app.data.kit.KitDao
import com.samay.app.data.kit.KitType

/**
 * Base de datos local de Samay.
 *
 * ⚠️ COMPARTIDA con P5: cuando Belen agregue la entity `Contact` + `ContactDao` (E1),
 * súmalos al array `entities`, agregá `abstract fun contactDao()` y **subí la versión**
 * a 2 (con migración o fallbackToDestructiveMigration en debug). Coordinar antes de tocar.
 */
@Database(
    entities = [Kit::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun kitDao(): KitDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun get(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "samay.db"
                ).build().also { INSTANCE = it }
            }
    }
}

/** Convierte el enum KitType para Room. */
class Converters {
    @TypeConverter fun fromKitType(value: KitType): String = value.name
    @TypeConverter fun toKitType(value: String): KitType = KitType.valueOf(value)
}
