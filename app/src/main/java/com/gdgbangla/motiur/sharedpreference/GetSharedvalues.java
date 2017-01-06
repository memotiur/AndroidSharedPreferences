package com.gdgbangla.motiur.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static com.gdgbangla.motiur.sharedpreference.SharedPreferenceClass.PREF_NAME;
import static com.gdgbangla.motiur.sharedpreference.SharedPreferenceClass.VALUE_AGE;
import static com.gdgbangla.motiur.sharedpreference.SharedPreferenceClass.VALUE_NAME;

public class GetSharedvalues extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_sharedvalues);
       // String name=sharedPreferenceObj.getValue(getApplicationContext());
        //Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();
        SharedPreferences sharedPreferences;
        sharedPreferences=getSharedPreferences(PREF_NAME, this.MODE_PRIVATE);
        String name=sharedPreferences.getString(VALUE_NAME,null);
        String age=sharedPreferences.getString(VALUE_AGE,null);
        message(name+age);
    }
    public void message(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
