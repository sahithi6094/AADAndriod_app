package brau.collegeofeng.sendnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        String channel_Id="ndschannel";
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel nc=new NotificationChannel
                    (channel_Id,"ndschannel",NotificationManager.IMPORTANCE_HIGH);
            nc.enableLights(true);
            nc.enableVibration(true);
            nc.setDescription("Simple Channel");
            nm.createNotificationChannel(nc);
        }
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,channel_Id);
        builder.setSmallIcon(R.drawable.ic_baseline_assignment_24);
        builder.setContentTitle("notification");
        builder.setContentText("this is a simple notification");
        Intent intent=new Intent(this,MainActivity.class);
        PendingIntent pi=PendingIntent.getActivity(this,23,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);
        builder.setAutoCancel(true);
        builder.setDefaults(NotificationCompat.DEFAULT_ALL);
        builder.setPriority(1);
        builder.addAction(R.drawable.ntr,"ntr",pi);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.ntr);
        builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap));
        nm.notify(23,builder.build());
    }
}