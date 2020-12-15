package com.example.navigationexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            Intent intent = NavUtils.getParentActivityIntent(this);
            if (NavUtils.shouldUpRecreateTask(this , intent)){
                TaskStackBuilder.create(this).addNextIntentWithParentStack(intent).startActivities();
            }else {
                NavUtils.navigateUpTo(this , intent);
            }
        }
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public void onBackPressed() {
//        Intent intent = NavUtils.getParentActivityIntent(this);
//        if (NavUtils.shouldUpRecreateTask(this , intent)){
//            TaskStackBuilder.create(this).addNextIntentWithParentStack(intent).startActivities();
//        }else {
//            NavUtils.navigateUpTo(this , intent);
//        }
//    }
}