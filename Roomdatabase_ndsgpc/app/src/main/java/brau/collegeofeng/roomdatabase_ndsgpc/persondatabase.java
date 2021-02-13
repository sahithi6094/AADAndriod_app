package brau.collegeofeng.roomdatabase_ndsgpc;

import android.app.Person;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Person.class},version = 1,exportSchema = false)
public abstract class persondatabase extends RoomDatabase {
    public abstract persondao persondao();
}
