package com.gdgbangla.motiur.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

/**
 * Created by Motiur Rahaman on 1/6/2017.
 */

public class SharedPreferenceClass {
    public static final String PREF_NAME="PREF_VALUES";
    public static final String VALUE_NAME="VALUE_NAME";
    public static final String VALUE_AGE="VALUE_AGE";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public void save(Context context, String name, String age){
        sharedPreferences=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor.putString(VALUE_NAME,name);
        editor.putString(VALUE_AGE,age);
        editor.apply();
    }

    public SharedPreferences getValue(Context context){
        sharedPreferences=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        String name=sharedPreferences.getString(VALUE_NAME,null);
        return sharedPreferences;
    }
    public void removeValue(Context context,String value){
        sharedPreferences=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor.remove(value);
        //To clear all values from shared preferences use clear(); method
        //editor.clear();
        editor.apply();
    }


}
