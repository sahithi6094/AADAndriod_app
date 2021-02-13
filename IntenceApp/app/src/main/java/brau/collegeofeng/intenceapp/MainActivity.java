package brau.collegeofeng.intenceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit1);
        editText2=findViewById(R.id.edit2);
        editText3=findViewById(R.id.edit3);
        webView=findViewById(R.id.web1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void secondscreen(View view) {
        Intent intent=new Intent(this,Secondactivity.class);
        startActivity(intent);
    }

    public void browser(View view) {
        String data=editText.getText().toString();
        Uri uri=Uri.parse("https://www."+data);
         Intent i=new Intent(Intent.ACTION_VIEW,uri);
         startActivity(i);

    }
    public void dail(View view) {
        String data=editText2.getText().toString();
        Uri uri= Uri.parse("tel:"+data);
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void senddeta(View view) {
        String name=editText3.getText().toString();
        Intent intent=new Intent(this,Secondactivity.class);
        intent.putExtra("KEY",name);
        startActivity(intent);
    }
}