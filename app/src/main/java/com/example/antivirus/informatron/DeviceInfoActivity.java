package com.example.antivirus.informatron;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DeviceInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

        List<HardwareObject> mObject = getHardwareInformation();
        ListView androidList = (ListView)this.findViewById(R.id.lstViewInfo);
        HardwareAdapter hAdapter = new HardwareAdapter(this, mObject);
        androidList.setAdapter(hAdapter);
    }
    private List<HardwareObject> getHardwareInformation(){
        List<HardwareObject> hardware = new ArrayList<HardwareObject>();
        String[] mAndroid = getAndroidHardWare();
        hardware.add(new HardwareObject("TAGS", android.os.Build.TAGS));
        hardware.add(new HardwareObject("DEVICE", android.os.Build.DEVICE));
        hardware.add(new HardwareObject("BOARD", android.os.Build.BOARD));
        hardware.add(new HardwareObject("SDK", mAndroid[0]));
        hardware.add(new HardwareObject("Version", mAndroid[1]));
        hardware.add(new HardwareObject("Brand", mAndroid[2]));
        hardware.add(new HardwareObject("Manufacturer", mAndroid[3]));
        hardware.add(new HardwareObject("Model", mAndroid[4]));
        hardware.add(new HardwareObject("Display", mAndroid[5]));
        hardware.add(new HardwareObject("Product", mAndroid[6]));
        hardware.add(new HardwareObject("USER", android.os.Build.USER));
        hardware.add(new HardwareObject("TYPE", Build.TYPE));
        hardware.add(new HardwareObject("ID", Build.ID));
        return hardware;
    }
    private String[] getAndroidHardWare(){
        String androidSDK = String.valueOf(android.os.Build.VERSION.SDK_INT);
        String androidVersion = android.os.Build.VERSION.RELEASE;
        String androidBrand = android.os.Build.BRAND;
        String androidManufacturer = android.os.Build.MANUFACTURER;
        String androidModel = android.os.Build.MODEL;
        String androidDisplay = android.os.Build.DISPLAY;
        String androidProduct = android.os.Build.PRODUCT;
        return new String[]{androidSDK, androidVersion, androidBrand, androidManufacturer, androidModel, androidDisplay, androidProduct};
    }
}
