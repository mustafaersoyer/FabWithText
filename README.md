<h1 align="center">Welcome to Circular Flaoating Action Button with Text 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-0.0.3-blue.svg?cacheSeconds=2592000" />

</p>

> Simple Floating Action Button with text

![alt text](https://github.com/mustafaersoyer/FabWithText/blob/master/Capture.PNG?raw=true)


## Install
Firstly, add Jitpack repository in your root build.gradle file (not your module build.gradle file):

```sh
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

Add dependency to your module's build.gradle file:

```sh
dependencies {
       implementation 'com.github.mustafaersoyer:fabwithtext:0.0.3'
}
```

## Usage

```sh
<com.me.textfab.FloatingActionButton
        android:foreground="?android:attr/selectableItemBackground"
        app:floating_background_color="@color/colorAccent"
        app:floating_title="Start Tour"
        app:floating_title_color="@android:color/white"
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:elevation="0dp"
        android:layout_alignParentBottom="true"
        android:layout_alignParentRight="true"
        android:layout_gravity="bottom|center"
        android:layout_marginBottom="70dp"
        android:layout_marginLeft="10dp"
        android:layout_marginRight="10dp"
        android:layout_centerInParent="true" />
```

![alt text](https://github.com/mustafaersoyer/FabWithText/blob/master/rsz1_scren.PNG?raw=true)


## Author

👤 ** Mustafa ERSOY**

* Twitter: [@mustafaersoyx](https://twitter.com/mustafaersoyx)
* Github: [@mustafaersoyer](https://github.com/mustafaersoyer)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
