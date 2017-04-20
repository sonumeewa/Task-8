package com.example.sonumeewa.task_8;

import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class buyerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"FAB Clicked", Toast.LENGTH_SHORT).show();
            }
        });





        // Create an ArrayList of AndroidFlavor objects
        ArrayList<Seller> sellers = new ArrayList<Seller>();
        sellers.add(new Seller("global electronics", "0.8","Surat, Gujarat,India","Wholesaler","Switches and switchgear"));
        sellers.add(new Seller("krishna light junction", "1.6","Ahemdabad, Gujarat,India","Dealer","Switches and Lights"));
        sellers.add(new Seller("patel electronics", "2.0","Gandhinagar,India","Wholesaler","Wires and Lights"));
        sellers.add(new Seller("eco lighting solutions", "1.3", "Delhi,India","Dealer","Electrical circuits"));
        sellers.add(new Seller("bombay electronics", "5.0", " Meerut,India","Wholesaler","Breadboards"));
        sellers.add(new Seller("grotal lights and products", "0.3", "Lucknow, Gujarat,India","Dealer","Appliances"));
        sellers.add(new Seller("opera solutions", "0.6", "Mumbai,India","Retailer","Motors"));
        sellers.add(new Seller("oreva solutions", "0.7", "Kolkata,India","Wholesaler","Inverter and power options"));
        sellers.add(new Seller("sky electricals", "0.8", "Chennai,India","Service","Cables"));
        sellers.add(new Seller("syska solutions", "0.9", "Haridwar,India","Wholesaler","LED'd"));
        sellers.add(new Seller("philips point", "1.0", "Jammu,India","Dealer","Switches and switchgear"));

        SellerAdapter sellerAdapter = new SellerAdapter(this, sellers);

        final ListView listView = (ListView) findViewById(R.id.listview_seller);
        listView.setAdapter(sellerAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Seller currenSeller=(Seller) listView.getItemAtPosition(position);

                MyBottomSheetDialogFragment.newInstance(currenSeller.getName(), currenSeller.getCity(), currenSeller.getType(), currenSeller.getCategory()).show(getSupportFragmentManager(), "BottomUp");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.chat:
                //do nothing for now.
                Toast.makeText(this,"Chat Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.profile:
                Toast.makeText(this,"Profile Clicked", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);

            case R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
