package brau.collegeofeng.sharedprefs1_abr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edit1);
        textView=findViewById(R.id.text1);
    }

    public void save(View view) {
        String  data=name.getText().toString();
        SharedPreferences preferences=getSharedPreferences("value", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("MSG",data);
        editor.apply();
        Toast.makeText(this, "Saved successfully", Toast.LENGTH_SHORT).show();
    }

    public void read(View view) {
        SharedPreferences preferences=getSharedPreferences("value",Context.MODE_PRIVATE);
        String txt =preferences.getString("MSG","");
        textView.setText("Messages:"+txt);
    }
}