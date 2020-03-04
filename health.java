package com.example.pienjay.basic;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;

public class health extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        String srvc = Context.TELEPHONY_SERVICE;
        TelephonyManager telephonyManager=(TelephonyManager) getSystemService(srvc);
        Context context= getApplicationContext();
        String locale = context.getResources().getConfiguration().locale.getDisplayCountry();
    }

    public void hospital(View v) {
    }
    public void healthcare(View v) {
    }
    public void doctor(View v) {
    }
    public void pharmacy(View v) {
    }
    public void dentist(View v) {
    }
}
