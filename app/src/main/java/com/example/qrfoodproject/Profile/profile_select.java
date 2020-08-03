package com.example.qrfoodproject.Profile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qrfoodproject.FoodDairy.FoodDairy_main;
import com.example.qrfoodproject.R;
import com.example.qrfoodproject.login.sessionCheck;


public class profile_select extends AppCompatActivity {
    Button btn_profile,btn_editAccount,btn_logout,btn_foodDiary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_select);
        setView();
        setClick();
    }

    private  void setView(){
        btn_profile = findViewById(R.id.btn_profile);
        btn_editAccount = findViewById(R.id.btn_editAccount);
        btn_logout = findViewById(R.id.btn_logout);
        btn_foodDiary = findViewById(R.id.btn_foodDiary);
    }

    private void setClick(){
        btn_profile.setOnClickListener(onclick);
        btn_editAccount.setOnClickListener(onclick);
        btn_logout.setOnClickListener(onclick);
        btn_foodDiary.setOnClickListener(onclick);
    }

    Button.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                //前往「個人資料」
                case R.id.btn_profile:
                    new sessionCheck().jump_afterSessionCheck(profile_select.this,Profile_main.class);
                    break;

                //前往「修改密碼」
                case R.id.btn_editAccount:
                    new sessionCheck().jump_afterSessionCheck(profile_select.this, Profile_ModifyPassword.class);
                    break;

                //前往「登出」
                case R.id.btn_logout:
                    new sessionCheck().logout(profile_select.this);
                    break;

                //前往「飲食計算機」
                case R.id.btn_foodDiary:
                    new sessionCheck().jump_afterSessionCheck(profile_select.this, FoodDairy_main.class);
                    break;
            }
        }
    };

}
