# EasyInterstitial
Easy Interstitial Implementation with OnAdClosed Listener.

Steps to Configure & Use EasyInterstitial Library:

-------------------------------------------------------------
Step 1. Add the JitPack repository to your build file:
Add it in your root build.gradle at the end of repositories:
-------------------------------------------------------------

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
-------------------------------------------------------------
  Step 2. Add the dependency
  -------------------------------------------------------------
  
  dependencies {
	        implementation 'com.github.ammarch884:EasyInterstitial:1.0.0'
	}
  
  -------------------------------------------------------------
  Step 3: Usage
  -------------------------------------------------------------
  i) Load the Interstitial wherever you want:
  EasyInterstitial.load_interstitial(your_context, your_interstitial_id, yourLogTag);
  
  ii) Show the Interstitial wherever you want:
  EasyInterstitial.show_insterstitial(your_activity, new OnInterstitialClosedListener(){
            @Override
            public void OnInterstitialClosed() {
                
            }
  });
  
-------------------------------------------------------------
                    Implementation Example
-------------------------------------------------------------
EasyInterstitial.load_interstitial(MainActivity.this, "ca-app-pub-3940256099942544/1033173712", "Ads_");

EasyInterstitial.show_insterstitial(this, new OnInterstitialClosedListener() {
            @Override
            public void OnInterstitialClosed() {
                 
            }
        });
        
        
