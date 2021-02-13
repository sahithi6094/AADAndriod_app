package brau.collegeofeng.sahicountapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count =0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text1);

    }

    public void count(View view) {
        count++;
        textView.setText(""+count);
    }

    public void trost(View view) {
        Toast.makeText(this,"hai ndsgpc",
                Toast.LENGTH_LONG).show();
    }
}