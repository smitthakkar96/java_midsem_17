## MCAD Notes

## What is mobile communication?

A wireless form of communication in which voice and data information, transmitted and received via microwaves. This type of communication allows individuals to converse with one another and/or transmit and receive data while moving from place to place. Some examples include: cellular and digital cordless telephones; pagers; telephone answering devices; air-to- ground telecommunications; and satellite-based communications.

## What is middleware?
Software that facilitates exchange of data between two application programs within the same environment, or across different hardware and network environments. Three basic types of middleware are (1) communication middleware, (2) database middleware, and (3) system middleware.

## Explain Cell Cluster
A Cell is the basic geographical unit of a cellular system. Commonly represented as a hexagon.
The term cellular comes from the hexagonal or honeycomb shape of the coverage area. Each cell has a Base Station transmitting over a cell.

A cluster is a group of cells. No frequencies are reused within a cluster. Frequencies used in one cell cluster can be reused in another cluster of cells. A large number of cells per cluster arrangement reduces interference to the system.

## Function of BTS with Example
    - Encoding, encrypting, multiplexing, modulating, and feeding the RF signals to the antenna
    - Transcoding and rate adaptation
    - Time and frequency synchronizing
    - Voice through full- or half-rate services
    - Decoding, decrypting, and equalizing received signals
    - Random access detection
    - Timing advances
    - Uplink channel measurements

CDMA (Code Division Multiple Access) and GSM (Global System for Mobiles)

## Define emulator
In computing, an emulator is hardware or software that enables one computer system (called the host) to behave like another computer system (called the guest). An emulator typically enables the host system to run software or use peripheral devices designed for the guest system.

## Android LifeCycle
![android life cycle](https://developer.android.com/images/activity_lifecycle.png)

The entire lifetime of an activity happens between the first call to onCreate(Bundle) through to a single final call to onDestroy(). An activity will do all setup of "global" state in onCreate(), and release all remaining resources in onDestroy(). For example, if it has a thread running in the background to download data from the network, it may create that thread in onCreate() and then stop the thread in onDestroy().

The visible lifetime of an activity happens between a call to onStart() until a corresponding call to onStop(). During this time the user can see the activity on-screen, though it may not be in the foreground and interacting with the user. Between these two methods you can maintain resources that are needed to show the activity to the user. For example, you can register a BroadcastReceiver in onStart() to monitor for changes that impact your UI, and unregister it in onStop() when the user no longer sees what you are displaying. The onStart() and onStop() methods can be called multiple times, as the activity becomes visible and hidden to the user.

The foreground lifetime of an activity happens between a call to onResume() until a corresponding call to onPause(). During this time the activity is in front of all other activities and interacting with the user. An activity can frequently go between the resumed and paused states -- for example when the device goes to sleep, when an activity result is delivered, when a new intent is delivered -- so the code in these methods should be fairly lightweight.

``` java
 public class Activity extends ApplicationContext {
     protected void onCreate(Bundle savedInstanceState); // This is the first callback and called when the activity is first created.

     protected void onStart(); // This callback is called when the activity becomes visible to the user.

     protected void onRestart(); // This callback is called when the activity restarts after stopping it.

     protected void onResume(); // This is called when the user starts interacting with the application.
     protected void onPause(); // The paused activity does not receive user input and cannot execute any code and called when the current activity is being paused and the previous activity is being resumed.
     protected void onStop(); // This callback is called when the activity is no longer visible.

     protected void onDestroy(); // This callback is called when the activity restarts after stopping it.
 }

```

## Linear Layout
``` xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingLeft="16dp"
    android:paddingRight="16dp"
    android:orientation="vertical" >
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/to" />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/subject" />
    <EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:gravity="top"
        android:hint="@string/message" />
    <Button
        android:layout_width="100dp"
        android:layout_height="wrap_content"
        android:layout_gravity="right"
        android:text="@string/send" />
</LinearLayout>
```

## Relative Layout

RelativeLayout is a view group that displays child views in relative positions. The position of each view can be specified as relative to sibling elements (such as to the left-of or below another view) or in positions relative to the parent RelativeLayout area (such as aligned to the bottom, left or center).

``` xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingLeft="16dp"
    android:paddingRight="16dp" >
    <EditText
        android:id="@+id/name"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="@string/reminder" />
    <Spinner
        android:id="@+id/dates"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/name"
        android:layout_alignParentLeft="true"
        android:layout_toLeftOf="@+id/times" />
    <Spinner
        android:id="@id/times"
        android:layout_width="96dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/name"
        android:layout_alignParentRight="true" />
    <Button
        android:layout_width="96dp"
        android:layout_height="wrap_content"
        android:layout_below="@id/times"
        android:layout_alignParentRight="true"
        android:text="@string/done" />
</RelativeLayout>
```

``` xml
    <RelativeLayout
        android:width="match_parent"
        android:height="wrap_content"
        android:padding="10dp">
        <EditText
            android:layout_alignParentLeft="true"
            android:width="300dp"
            android:height="wrap_content"
            android:hint="Enter Name"
            android:id="@+id/name"/>
        <EditText
            android:layout_alignParentRight="false"
            android:width="96dp"
            android:height="wrap_content"
            android:text="submit"
            android:layout_toRightOf="@+id/name"/>
    </RelativeLayout>
```

## Platform architechure
![platform architechure](https://developer.android.com/guide/platform/images/android-stack_2x.png)


## Toggle Button

``` xml
<ToggleButton
    android:id="@+id/toogleButton"
    android:layout_height="wrap_content"
    android:layout_width="match_parent"/>
```

``` java
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
    toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener{
        public void onCheckedChange(CompoundButton b, boolean checked) {
            if(checked) {
                Toast.makeText(getApplicationContext(), "on", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "off", Toast.LENGTH_SHORT).show();
            }
        }
    });
}
```
