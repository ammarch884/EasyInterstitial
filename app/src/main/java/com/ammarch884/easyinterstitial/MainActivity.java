package com.ammarch884.easyinterstitial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ammarch884.easyinsterstitiallibrary.EasyInterstitial;
import com.ammarch884.easyinsterstitiallibrary.OnInterstitialClosedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EasyInterstitial.load_interstitial(MainActivity.this, "", "Ads_");
        EasyInterstitial.show_insterstitial(this, new OnInterstitialClosedListener() {
            @Override
            public void OnInterstitialClosed() {
                
            }
        });
    }
}