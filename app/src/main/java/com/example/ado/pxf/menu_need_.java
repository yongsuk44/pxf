package com.example.ado.pxf;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class menu_need_ extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
String string, name;
    ImageView iv1 = null, iv2 = null, iv3 = null, iv4 = null;
    int stat, img, stat2, stat3, stat4;
    TextView tool = null;
    int[][] age = {{R.drawable.m_drafting_bottom,R.drawable.m_drafting_dress,R.drawable.m_drafting_sleeve,R.drawable.m_drafting_top},
            {R.drawable.m_draping_bottom,R.drawable.m_draping_line,R.drawable.m_draping_dart,R.drawable.m_draping_top},
            {R.drawable.m_homeacce_acce,R.drawable.m_homeacce_home,0,0},
            {R.drawable.m_need, R.drawable.m_need_basic, R.drawable.m_need_size,0}};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_need_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        iv1 = (ImageView)findViewById(R.id.iv1);
        iv2 = (ImageView)findViewById(R.id.iv2);
        iv3 = (ImageView)findViewById(R.id.iv3);
        iv4 = (ImageView)findViewById(R.id.iv4);
        tool = (TextView)findViewById(R.id.need_text);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final Intent intent  = getIntent();
        string = intent.getStringExtra("set");
        stat = intent.getIntExtra("set",0);
        img = intent.getIntExtra("img",0);
        tool.setText(string);

        if(img == 0){
            iv1.setImageResource(age[3][0]);
            iv2.setImageResource(age[3][1]);
            iv3.setImageResource(age[3][2]);
            iv3.setVisibility(View.VISIBLE);

            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "기본 준비물");
                    intent.putExtra("img", 0);
                    startActivity(intent);
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "기본 원형");
                    intent.putExtra("img", 1);
                    startActivity(intent);
                }
            });
            iv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "기본 치수");
                    intent.putExtra("img", 2);
                    startActivity(intent);
                }
            });

        }else if(img == 1){
            iv1.setImageResource(age[1][0]);
            iv2.setImageResource(age[1][1]);
            iv3.setImageResource(age[1][2]);
            iv4.setImageResource(age[1][3]);

            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "드레이핑 하의");
                    intent.putExtra("img", 3);
                    startActivity(intent);
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "바디 선 치기");
                    intent.putExtra("img", 4);
                    startActivity(intent);
                }
            });
            iv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "카라 ＆ 다트");
                    intent.putExtra("img", 5);
                    startActivity(intent);
                }
            });
            iv4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "드레이핑 상의");
                    intent.putExtra("img", 6);
                    startActivity(intent);
                }
            });
            iv3.setVisibility(View.VISIBLE);
            iv4.setVisibility(View.VISIBLE);

        }else if(img == 2){
            iv1.setImageResource(age[0][0]);
            iv2.setImageResource(age[0][1]);
            iv3.setImageResource(age[0][2]);
            iv4.setImageResource(age[0][3]);

            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "드레프팅 하의");
                    intent.putExtra("img", 7);
                    startActivity(intent);
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "원피스");
                    intent.putExtra("img", 8);
                    startActivity(intent);
                }
            });
            iv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "소매");
                    intent.putExtra("img", 9);
                    startActivity(intent);
                }
            });
            iv4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "드레프팅 상의");
                    intent.putExtra("img", 10);
                    startActivity(intent);
                }
            });
            iv3.setVisibility(View.VISIBLE);
            iv4.setVisibility(View.VISIBLE);

        }else if(img == 3){
            iv1.setImageResource(age[2][0]);
            iv2.setImageResource(age[2][1]);
            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "홈 패션");
                    intent.putExtra("img", 11);
                    startActivity(intent);
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(menu_need_.this, menu_need_list.class);
                    intent.putExtra("set", "악세사리");
                    intent.putExtra("img", 12);
                    startActivity(intent);
                }
            });
        }

    }
   /* View.OnClickListener ins = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent;
            switch (view.getId()) {
                case R.id.iv1:
                    intent = new Intent(menu_need_.this, menu_slide.class);
                    intent.putExtra("stat", stat2);
                    intent.putExtra("img", 0);
                    startActivity(intent);
                    break;
                case R.id.iv2:
                    intent = new Intent(menu_need_.this, menu_slide.class);
                    intent.putExtra("stat", stat2);
                    intent.putExtra("img", 1);
                    startActivity(intent);
                    break;
                case R.id.iv3:
                    intent = new Intent(menu_need_.this, menu_slide.class);
                    intent.putExtra("stat", stat2);
                    intent.putExtra("img", 2);
                    startActivity(intent);
                    break;
                case R.id.iv4:
                    intent = new Intent(menu_need_.this, menu_slide.class);
                    intent.putExtra("stat", stat2);
                    intent.putExtra("img", 3);
                    startActivity(intent);
                    break;

            }
        }


    };*/
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent;
        if (id == R.id.menu_Need2) {
            intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"기본준비물 ＆ 원형");
            intent.putExtra("img", 0);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == R.id.menu_Draping2) {
            intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"드레이핑");
            intent.putExtra("img", 1);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == R.id.menu_Drafting2) {
            intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"드레프팅");
            intent.putExtra("img", 2);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (id == R.id.menu_HomAcce2) {
            intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"홈패션 ＆ 악세사리");
            intent.putExtra("img", 3);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
