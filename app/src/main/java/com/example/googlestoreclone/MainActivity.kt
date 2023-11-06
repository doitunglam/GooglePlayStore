package com.example.googlestoreclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applications = ArrayList<ApplicationModel>();

        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));
        applications.add(ApplicationModel(R.drawable.facebook_logo,"Demo App", "5"));

        val category1 = ApplicationCategoryModel("Category A", applications);
        val category2 = ApplicationCategoryModel("Category B", applications);
        val category3 = ApplicationCategoryModel("Category B", applications);
        val category4 = ApplicationCategoryModel("Category B", applications);
        val category5 = ApplicationCategoryModel("Category B", applications);

        val categories = ArrayList<ApplicationCategoryModel>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);

        val categoryAdapter = ApplicationRowAdapter(categories);

        val applicationCategories = findViewById<RecyclerView>(R.id.application_categories)

        applicationCategories.adapter = categoryAdapter
        applicationCategories.layoutManager = LinearLayoutManager(this);

    }
}