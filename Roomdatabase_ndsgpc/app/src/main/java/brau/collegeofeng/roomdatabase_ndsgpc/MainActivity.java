package brau.collegeofeng.roomdatabase_ndsgpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.app.Person;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText name,age;
    TextView result;
    persondatabase persondatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name1);
        result=findViewById(R.id.text1);
        age=findViewById(R.id.age1);
        persondatabase= Room.databaseBuilder(this,persondatabase.class,"mydb").allowMainThreadQueries().build();


    }

    public void save(View view) {
    String name1= name.getText().toString();
    int age1=Integer.parseInt(age.getText().toString());
    Person person= new Person(name1,age1);
    persondatabase.persondao().insert(person);
    getData();


    }

    private void getData() {
        List<Person> p=persondatabase.persondao().getAll();
        result.setText("");
        for (int i=0;i<p.size();i++){
            result.append(p.get(i).2);
        }
    }
}