package com.inducesmile.androiddatabinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = (RecyclerView) findViewById(R.id.food_category);
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mGrid);
        recyclerView.setHasFixedSize(true);
        CategoryAdapter mAdapter = new CategoryAdapter(this, testData());
        recyclerView.setAdapter(mAdapter);
    }

    private List<CategoryObject> testData() {
        List<CategoryObject> categoryList = new ArrayList<>();
        categoryList.add(new CategoryObject("Pizza", "https://professionalmorondotcom.files.wordpress.com/2015/10/pizza.png"));
        categoryList.add(new CategoryObject("Bulgar", "https://professionalmorondotcom.files.wordpress.com/2015/10/pizza.png"));
        categoryList.add(new CategoryObject("Baked Potato", "https://professionalmorondotcom.files.wordpress.com/2015/10/pizza.png"));
        categoryList.add(new CategoryObject("Soup", "https://professionalmorondotcom.files.wordpress.com/2015/10/pizza.png"));
        return categoryList;
    }

}
