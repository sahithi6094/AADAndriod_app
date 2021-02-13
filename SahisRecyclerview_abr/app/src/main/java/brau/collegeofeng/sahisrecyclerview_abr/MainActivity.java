package brau.collegeofeng.sahisrecyclerview_abr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
int images[]={R.drawable.sahi,R.drawable.sahi3,R.drawable.sahi4,R.drawable.sahi5,
        R.drawable.sahi8,R.drawable.sahi9,R.drawable.sahithi,
        R.drawable.sahi10,R.drawable.sahi5,R.drawable.sahicars};
String names[]={"RR","BMW","suzuki","lambergini","audi","ferari","ford","astronmartin","cadillac","datsun",};
MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler1);
        myAdapter =new MyAdapter(this,images,names);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}