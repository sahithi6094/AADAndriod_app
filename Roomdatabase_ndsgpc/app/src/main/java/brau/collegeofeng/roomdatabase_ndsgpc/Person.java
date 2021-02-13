package brau.collegeofeng.roomdatabase_ndsgpc;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "person")
public class Person {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

}
