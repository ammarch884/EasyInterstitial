# EasyInterstitial

Easy Interstitial Implementation with OnAdClosed Listener.

## Installation

### Step 1. Add the JitPack repository to your build file: Add it in your root build.gradle at the end of repositories:


```java
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add the dependency

```java
dependencies {
	        implementation 'com.github.ammarch884:EasyInterstitial:1.0.0'
	}
```

### Step 3. Usage

#### (i) Load the Interstitial wherever you want: 

```java


 EasyInterstitial.load_interstitial(your_context, your_interstitial_id, yourLogTag); 


```

#### (ii) Show the Interstitial wherever you want: 

```java


 EasyInterstitial.show_insterstitial(this, new OnInterstitialClosedListener() {
            @Override
            public void OnInterstitialClosed() {
               // Perform your action here, it will be called after InterstitialAd is Closed.

            }
        });


```

### Example:

```java


 
// Loading the Interstitial.
 EasyInterstitial.load_interstitial(MainActivity.this, "ca-app-pub-3940256099942544/1033173712", "Ads_");  

// Showing the Interstitial.
 EasyInterstitial.show_insterstitial(this, new OnInterstitialClosedListener() {
            @Override
            public void OnInterstitialClosed() {
              // Perform your action here, it will be called after InterstitialAd is Closed.
              Intent intent = new Intent(MainActivity.this, SecondActivity.class);
              startActivity(intent);
            }
        });

```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://github.com/ammarch884/EasyInterstitial/compare/master...add-license-1?quick_pull=1#diff-c693279643b8cd5d248172d9c22cb7cf4ed163a3c98c8a3f69c2717edd3eacb7)
