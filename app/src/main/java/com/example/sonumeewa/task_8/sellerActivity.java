package com.example.sonumeewa.task_8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class sellerActivity extends AppCompatActivity {
     private String internetfailmessage="No inernet connection found"+"/n"+"check it or try again later.";
    private String internetfailurestatus="Oopsss!";
    private String internetsuccessstatus="connected";
    private String internetsuccessmessage="inernet connection found.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seller);

        setmessages();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        ;

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }
    private void setmessages(){
        if(isNetworkAvailable())
        {

            TextView status=(TextView)findViewById(R.id.statusText);
            TextView message=(TextView)findViewById(R.id.statusMessage);
            ImageView image=(ImageView)findViewById(R.id.statusImage);
            image.setImageResource(R.drawable.yes);
            status.setText(internetsuccessstatus);
            status.setAllCaps(true);
            message.setText(internetsuccessmessage);
            message.setAllCaps(true);
        }
        else
        {
            TextView status=(TextView)findViewById(R.id.statusText);
            TextView message=(TextView)findViewById(R.id.statusMessage);
            ImageView image=(ImageView)findViewById(R.id.statusImage);
            image.setImageResource(R.drawable.no);
            status.setText(internetfailurestatus);
            status.setAllCaps(true);
            message.setText(internetfailmessage);
            message.setAllCaps(true);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.chat:
                //do nothing for now.
                return true;
            case R.id.profile:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
