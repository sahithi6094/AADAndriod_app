package brau.collegeofeng.alarms_abr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    AlarmManager am;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.tog1);
        Intent intent=new Intent(MainActivity.this,MyReceiver.class);
        PendingIntent pi=PendingIntent.getBroadcast(MainActivity.this,23,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        am=(AlarmManager) getSystemService(ALARM_SERVICE);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (toggleButton.isChecked()){

                    long triggertime= SystemClock.elapsedRealtime();
                    long intervaltime=2*60*1000;
                    am.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggertime,intervaltime,pi);
                Toast.makeText(MainActivity.this, "on", Toast.LENGTH_SHORT).show();
                }
                else {
                    am.cancel(pi);
                    Toast.makeText(MainActivity.this, "off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}