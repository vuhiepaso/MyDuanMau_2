package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {

    ImageView img_nd, img_sach, img_theloai, img_hoaDonn, img_topSach, img_TK ;

    LinearLayout textsplash, texthome, menus;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);


        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);
        img_nd=(ImageView) findViewById(R.id.img_nd);
        img_sach=(ImageView) findViewById(R.id.img_Sach);
        img_theloai = (ImageView) findViewById(R.id.img_theloai);
        img_hoaDonn = findViewById(R.id.img_hoaDon);
        img_topSach = findViewById(R.id.img_sachBC);
        img_TK = findViewById(R.id.img_thongKe);

        img_nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,User_account.class);
                startActivity(intent);
            }
        });

        img_theloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListTheLoaiActivity.class);
                startActivity(intent);
            }
        });

        img_sach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListSachActivity.class);
                startActivity(intent);
            }
        });

        img_hoaDonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListHoaDonActivity.class);
                startActivity(intent);
            }
        });

        img_topSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListBanChayActivity.class);
                startActivity(intent);
            }
        });

        img_TK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListThongKeActivity.class);
                startActivity(intent);
            }
        });


        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);
    }
}

