package com.example.antivirus.informatron;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DeviceInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

        List<HardwareObject> mObject = getHardwareInformation();
        ListView androidList = (ListView) this.findViewById(R.id.lstViewInfo);
        HardwareAdapter hAdapter = new HardwareAdapter(this, mObject);
        androidList.setAdapter(hAdapter);
    }

    private List<HardwareObject> getHardwareInformation() {
        String serviceName = this.TELEPHONY_SERVICE;
        TelephonyManager m_telephonyManager = (TelephonyManager) getSystemService(serviceName);
        String IMEI, IMSI;
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
                // something todo

        }
        IMEI = m_telephonyManager.getDeviceId();
        List<HardwareObject> hardware = new ArrayList<HardwareObject>();
        hardware.add(new HardwareObject("TAGS", android.os.Build.TAGS));
        hardware.add(new HardwareObject("DEVICE", android.os.Build.DEVICE));
        hardware.add(new HardwareObject("BOARD", android.os.Build.BOARD));
        hardware.add(new HardwareObject("SDK", String.valueOf(Build.VERSION.SDK_INT)));
        hardware.add(new HardwareObject("Version", Build.VERSION.RELEASE));
        hardware.add(new HardwareObject("Brand", Build.BRAND));
        hardware.add(new HardwareObject("Manufacturer", Build.MANUFACTURER));
        hardware.add(new HardwareObject("Model", Build.MODEL));
        hardware.add(new HardwareObject("Display", Build.DISPLAY));
        hardware.add(new HardwareObject("Product", Build.PRODUCT));
        hardware.add(new HardwareObject("USER", android.os.Build.USER));
        hardware.add(new HardwareObject("TYPE", Build.TYPE));
        hardware.add(new HardwareObject("ID", Build.ID));
        hardware.add(new HardwareObject("IMEI", IMEI));
        return hardware;
    }
}
