package br.edu.ifsp.scl.ads.pdm.cdv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String CDV_LOGCAT_TAG = "CDV_LOGCAT_TAG"; //logs tag whenever to be found on Logcat (bottom buttons near Terminal/Build)

    //constructor
    @Override
    //cycle: onCreate() -> onStart() -> onResume() -> onPause() -> onStop() -> onDestroy() -> onRestart()
    //COMPLETE(build) -> VISIBLE -> FIRST LEVEL(interactable)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing complete life-cycle
        Log.v(CDV_LOGCAT_TAG, "onCreate: Booting-up COMPLETE cycle"); //tag + msg
    }

    @Override
    protected void onStart() {
        super.onStart();

        //inicializing visible life-cycle
        Log.v(CDV_LOGCAT_TAG, "onStart: Booting-up VISIBLE cycle"); //tag + msg
    }

    @Override
    protected void onResume() {
        super.onResume();

        //inicializing foreground life-cycle
        Log.v(CDV_LOGCAT_TAG, "onResume: Booting-up FIRST LEVEL cycle"); //tag + msg
    }

    @Override
    protected void onPause() {
        super.onPause();

        //finalizing visible life-cycle
        Log.v(CDV_LOGCAT_TAG, "onPause: killing FIRST PLAN cycle"); //tag + msg
    }

    @Override
    protected void onStop() {
        super.onStop();

        //finalizing visible life-cycle
        Log.v(CDV_LOGCAT_TAG, "onStop: killing VISIBLE cycle"); //tag + msg
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //finalizing complete life-cycle
        Log.v(CDV_LOGCAT_TAG, "onDestroy: killing COMPLETE cycle"); //tag + msg
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        //enables onStart methods to trigger
        Log.v(CDV_LOGCAT_TAG, "onRestart: preparing methods from onStart()"); //tag + msg
    }
}