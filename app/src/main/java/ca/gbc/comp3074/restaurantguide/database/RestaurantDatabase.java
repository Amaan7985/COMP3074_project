package ca.gbc.comp3074.restaurantguide.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Restaurant.class}, version = 2, exportSchema = true) // Incremented version for schema updates
@TypeConverters(TagsConverter.class)
public abstract class RestaurantDatabase extends RoomDatabase {

    // Singleton instance to ensure only one database instance exists
    private static volatile RestaurantDatabase instance;

    /**
     * Get the singleton instance of the RestaurantDatabase.
     *
     * @param context Application context
     * @return The RestaurantDatabase instance
     */
    public static synchronized RestaurantDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                            context.getApplicationContext(),
                            RestaurantDatabase.class,
                            "restaurant_database"
                    )
                    .fallbackToDestructiveMigration() // Resets the database if schema changes (use cautiously)
                    .build();
        }
        return instance;
    }

    // Abstract method for accessing the DAO
    public abstract RestaurantDao restaurantDao();
}
