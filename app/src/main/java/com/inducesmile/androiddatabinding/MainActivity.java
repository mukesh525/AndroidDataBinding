package com.inducesmile.androiddatabinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.inducesmile.androiddatabinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements  ActionCallback{

    ActionCallback callback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ObservableArrayMap<String, Object> product = new ObservableArrayMap<>();
        ActivityMainBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindings.setProduct(product);
        bindings.setCallback(this);
        product.put("name", "Sleek Navy Blue Sandals");
        product.put("description", "Beautiful sleek sandals for your casual and cocktail dinner. Comes in different color");

    }




    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, RecyclerActivity.class));
    }
}