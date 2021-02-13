package brau.collegeofeng.inputcontrols;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    /*radioGroup is used together one or more buttons
     * Radio Button has two states either checked or unchecked
     * checkbox when presenting user with a group of selectable option
     * that are not mutually exclusive
     * switch is used to display checked or unchecked state of a button
     *providing slider controller to user
     * a spinner is a dropdown lists that allows usera to select one value from a list*/
    RadioGroup radio1;
    RadioButton radiob1, radiob2;
    CheckBox check1, check2, check3;
    Switch aSwitch;
    LinearLayout linearLayout;
    Spinner spinner;
    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio1 = findViewById(R.id.rg1);
        radiob1 = findViewById(R.id.rb1);
        radiob2 = findViewById(R.id.rb2);
        check1 = findViewById(R.id.ch1);
        check2 = findViewById(R.id.ch2);
        check3 = findViewById(R.id.ch3);
        aSwitch=findViewById(R.id.switch1);
        linearLayout=findViewById(R.id.linear1);
        spinner=findViewById(R.id.spinner1);
        datePicker=findViewById(R.id.datepicker1);
        timePicker=findViewById(R.id.timepicker1);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, 0+"", Toast.LENGTH_SHORT).show();
            }
        });
        ArrayList weaks=new ArrayList<>();
        weaks.add("SUNDAY");
        weaks.add("MONDAY");
        weaks.add("TUESDAY");
        weaks.add("WEDNESDAY");
        weaks.add("THURSDAY");
        weaks.add("FRIDAY");
        weaks.add("SATURDAY");
        /*Calendar calendar=Calendar.getInstance();
                datePicker.init(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(calendar.DAY_OF_MONTH)),new DatePicker.OnDateChangedListener()
                {

                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear=monthOfYear+1;
                        String date= dayOfMonth+"-"+monthOfYear+"-"+year;
                        Toast.makeText(MainActivity.this,date, Toast.LENGTH_SHORT).show();
                    }
                });*/
        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
             monthOfYear=monthOfYear+1;
             String date= dayOfMonth+"-"+monthOfYear+"-"+year;
                Toast.makeText(MainActivity.this, date, Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,weaks);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "selected"+weaks.get(0), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "Male",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "Female",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void img(View view) {
        Toast.makeText(this, "hai sahithi",
                Toast.LENGTH_SHORT).show();
    }

    public void submit(View view) {
        if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {
            Toast.makeText(this, "" + check1.getText() + "/n" + check2.getText() + "/n" + check3.getText(), Toast.LENGTH_SHORT).show();
        } else if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {
            Toast.makeText(this, "" + check1.getText() + "\n" + check2.getText(), Toast.LENGTH_SHORT).show();
        } else if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {
            Toast.makeText(this, "" + check1.getText() + "\n" + check3.getText(), Toast.LENGTH_SHORT).show();
        } else if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {
            Toast.makeText(this, "" + check2.getText() + "\n" + check3.getText(), Toast.LENGTH_SHORT).show();
        } else if (check1.isChecked()) {
            Toast.makeText(this, "" + check1, Toast.LENGTH_SHORT).show();
        } else if (check2.isChecked()) {
            Toast.makeText(this, "" + check2, Toast.LENGTH_SHORT).show();
        } else if (check3.isChecked()) {
            Toast.makeText(this, "" + check3, Toast.LENGTH_SHORT).show();
        }
    }

    public void changecolour(View view) {
        if (aSwitch.isChecked()) {
            linearLayout.setBackgroundColor(Color.GREEN);
        }else {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
    }
}