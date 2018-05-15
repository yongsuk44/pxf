package com.example.ado.pxf;

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

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView name[] = new ImageView[9];
    int imid[] = {R.id.imggather, R.id.imgskirt, R.id.imgrollcoll, R.id.imgragla, R.id.imghighneck, R.id.imghighskirt, R.id.imgpanta, R.id.imgvpouch, R.id.imgmaking };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        for (int i=0; i<imid.length; i++){
            name[i] = (ImageView)findViewById(imid[i]);
        }
        name[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "드레이핑 상의");
                intent.putExtra("img", 13);
                startActivity(intent);
            }
        });
        name[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "드레이핑 하의");
                intent.putExtra("img", 10);
                startActivity(intent);
            }
        });
        name[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "드레프팅 상의");
                intent.putExtra("img", 23);
                startActivity(intent);
            }
        });
        name[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "소매");
                intent.putExtra("img", 21);
                startActivity(intent);
            }
        });
        name[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "원피스");
                intent.putExtra("img", 19);
                startActivity(intent);
            }
        });
        name[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "드레프팅 하의");
                intent.putExtra("img", 15);
                startActivity(intent);
            }
        });
        name[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "드레프팅 하의");
                intent.putExtra("img", 16);
                startActivity(intent);
            }
        });
        name[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "악세사리");
                intent.putExtra("img", 26);
                startActivity(intent);
            }
        });
        name[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu_slide.class);
                intent.putExtra("set", "홈 패션");
                intent.putExtra("img", 27);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

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

        if (id == R.id.menu_Need) {
            Intent intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"기본준비물 ＆ 원형");
            intent.putExtra("img", 0);
            startActivity(intent);
        } else if (id == R.id.menu_Draping) {
            Intent intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"드레이핑");
            intent.putExtra("img", 1);
            startActivity(intent);
        } else if (id == R.id.menu_Drafting) {
            Intent intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"드레프팅");
            intent.putExtra("img", 2);
            startActivity(intent);
        } else if (id == R.id.menu_HomAcce) {
            Intent intent = new Intent(this, menu_need_.class);
            intent.putExtra("set"   ,"홈패션 ＆ 악세사리");
            intent.putExtra("img", 3);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
