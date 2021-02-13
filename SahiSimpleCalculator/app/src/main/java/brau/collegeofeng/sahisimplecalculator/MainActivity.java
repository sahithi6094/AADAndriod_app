package brau.collegeofeng.sahisimplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.edit1);
        num2=findViewById(R.id.edit2);
        res=findViewById(R.id.text1) ;
    }

    public void plus(View view) {
        int a,b,c;
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        c=a+b;
        res.setText(""+c);
    }

    public void substraction(View view) {
        int a,b,c;
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        c=a-b;
        res.setText(""+c);
    }

    public void multiplication(View view) {
        int a,b,c;
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        c=a*b;
        res.setText(""+c);
    }

    public void devision(View view) {
        int a,b,c;
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        c=a/b;
        res.setText(""+c);
    }
}