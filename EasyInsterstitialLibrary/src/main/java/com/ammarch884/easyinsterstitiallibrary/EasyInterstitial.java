package com.ammarch884.easyinsterstitiallibrary;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class EasyInterstitial {

    public static InterstitialAd mInterstitialAd;
    static Context mContext;
    static String interstitial_id;
    static String logTag = "Ads_";
    public static isAlreadyLoaded = false;

    public static void load_interstitial(Context your_activity_context, String your_interstitial_id, String yourLogTag) {

        if(!isAlreadyLoaded){
            mContext = your_activity_context;
        interstitial_id = your_interstitial_id;
        logTag = yourLogTag;

        Log.d(logTag, "Interstitial Load Request Sent.");

        AdRequest adRequest_interstitial = new AdRequest.Builder().build();

        InterstitialAd.load(mContext, your_interstitial_id, adRequest_interstitial,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.d(logTag, "Insterstitial Loaded.");
                        isAlreadyLoaded = true;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(logTag, "Interstitial Failed to Load."+loadAdError.getMessage());
                        mInterstitialAd = null;
                        isAlreadyLoaded = false;
                    }
                });
        }
        
    }


    public static void show_insterstitial(Activity yourActivity, OnInterstitialClosedListener onInterstitialClosedListener){

        mInterstitialAd.show(yourActivity);
        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
            @Override
            public void onAdDismissedFullScreenContent() {
                super.onAdDismissedFullScreenContent();

                onInterstitialClosedListener.OnInterstitialClosed();
                isAlreadyLoaded = false;
                EasyInterstitial.load_interstitial(mContext, interstitial_id, logTag);
            }
        });
    }
}
