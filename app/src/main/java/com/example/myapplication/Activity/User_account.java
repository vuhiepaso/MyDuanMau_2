package com.example.myapplication.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.myapplication.DBUser.User;
import com.example.myapplication.LoginScreen;
import com.example.myapplication.R;
import com.example.myapplication.SignUpScreen;
import com.example.myapplication.adapter.NguoiDungAdapter;
import com.example.myapplication.dao.NguoiDungDAO;
import com.example.myapplication.model.NguoiDung;
import com.example.myapplication.model.Sach;

import java.util.ArrayList;
import java.util.List;

public class User_account extends AppCompatActivity {

    public static List<NguoiDung> dsuser = new ArrayList<>();
    ListView lvListUser;
    NguoiDungAdapter nguoiDungAdapter=null;
    NguoiDungDAO nguoiDungDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Người dùng");
        setContentView(R.layout.activity_user_account);
        lvListUser=findViewById(R.id.lvListUser);
        nguoiDungDAO=new NguoiDungDAO(User_account.this);
        dsuser=nguoiDungDAO.getAllNguoiDung();
        nguoiDungAdapter=new NguoiDungAdapter(this,dsuser);
        lvListUser.setAdapter(nguoiDungAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_user, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.addUser:
                adduser();
                return true;
            case R.id.btnChangePass:
                repass();
                return true;
            case R.id.btnLogout:
                out();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    void adduser(){
        Intent intent=new Intent(User_account.this, add_User.class);
        startActivity(intent);
    }
    void repass(){
        Intent intent=new Intent(User_account.this, rePass.class);
        startActivity(intent);
    }
    void out(){
        Intent intent=new Intent(User_account.this, LoginScreen.class);
        startActivity(intent);
    }
}