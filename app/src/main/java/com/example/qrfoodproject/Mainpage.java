package com.example.qrfoodproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.qrfoodproject.login.sessionCheck;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Mainpage extends AppCompatActivity {

    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this,R.id.fragment);
        AppBarConfiguration configuration = new AppBarConfiguration.Builder(bottomNavigationView.getMenu()).build();
        NavigationUI.setupActionBarWithNavController(this,navController,configuration);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);

        //new sessionCheck().session_ifExist(this);
    }
}
