package brau.collegeofeng.roomdatabase_ndsgpc;

import android.app.Person;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface persondao {
    @Insert
    void insert(Person person);
    @Query("select * from person")
    List<Person> getAll();
    @Delete
    void delete(Person person);
}
