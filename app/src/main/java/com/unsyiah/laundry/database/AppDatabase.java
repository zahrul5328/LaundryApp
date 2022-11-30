package com.unsyiah.laundry.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.unsyiah.laundry.database.dao.LaundryDao;
import com.unsyiah.laundry.model.ModelLaundry;

@Database(entities = {ModelLaundry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LaundryDao laundryDao();
}
