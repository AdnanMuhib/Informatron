package com.example.antivirus.informatron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetDeviceInfo_clicked(View view){
        try
        {
        Intent intent = new Intent(this, DeviceInfoActivity.class);
        startActivity(intent);
        }
        catch (Exception e){
            Log.e("Error",e.getMessage().toString());
        }
    }

    public void GetContacts_clicked(View view){
        try
        {
            Intent intent = new Intent(this, ContactListActivity.class);
            startActivity(intent);
        }
        catch (Exception e){
            Log.e("Error",e.getMessage().toString());
        }
    }
    public  void GetCallHistory_clicked(View view){
        try
        {
            Intent intent = new Intent(this, DeviceInfoActivity.class);
            startActivity(intent);
        }
        catch (Exception e){
            Log.e("Error",e.getMessage().toString());
        }
    }

    public  void GetMessages_clicked(View view){
        try
        {
            Intent intent = new Intent(this, readSMSActivity.class);
            startActivity(intent);
        }
        catch (Exception e){
            Log.e("Error",e.getMessage().toString());
        }
    }

    public  void GetInstalledApps_clicked(View view){
        try
        {
            Intent intent = new Intent(this, DeviceInfoActivity.class);
            startActivity(intent);
        }
        catch (Exception e){
            Log.e("Error",e.getMessage().toString());
        }
    }

}
