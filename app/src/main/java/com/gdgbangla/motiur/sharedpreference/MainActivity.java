package com.gdgbangla.motiur.sharedpreference;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.gdgbangla.motiur.sharedpreference.SharedPreferenceClass.VALUE_NAME;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    SharedPreferenceClass sharedPreferenceObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=(EditText)findViewById(R.id.etname);
        etAge=(EditText)findViewById(R.id.etage);
        sharedPreferenceObj=new SharedPreferenceClass();
    }

    public void save(View view) {
        String name=etName.getText().toString();
        String  age=etAge.getText().toString();
        sharedPreferenceObj.save(getApplicationContext(),name,age);
        message("Saved");
    }

    public void view(View view) {
        Intent intent=new Intent(this,GetSharedvalues.class);
        startActivity(intent);
    }

    public void message(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    public void remove(View view) {
        sharedPreferenceObj.removeValue(this,VALUE_NAME);
    }
}
