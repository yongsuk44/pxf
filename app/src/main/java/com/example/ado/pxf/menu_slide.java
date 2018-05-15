package com.example.ado.pxf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class menu_slide extends AppCompatActivity {
String string;
    ViewPager pager;
    int stat, img;

    ImageView slideimg;
    Button left, right;
    TextView tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_slide);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        left = (Button)findViewById(R.id.bt_left);
        right = (Button)findViewById(R.id.bt_right);
        pager = (ViewPager)findViewById(R.id.pager);
        tool = (TextView)findViewById(R.id.slide_text);

        Intent intent = getIntent();
        stat = intent.getIntExtra("set",0);
        img = intent.getIntExtra("img",0);
        string = intent.getStringExtra("set");
        tool.setText(string);


        custom adp = new custom(getLayoutInflater(),img);
        pager.setAdapter(adp);

        setSupportActionBar(toolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.back);


        left.setOnClickListener(ins);
        right.setOnClickListener(ins);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            }
            return super.onOptionsItemSelected(item);
    }

    View.OnClickListener ins = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int pos;

            switch (view.getId()){
                case R.id.bt_left:
                    pos = pager.getCurrentItem();
                    pager.setCurrentItem(pos-1,true);
                    break;
                case R.id.bt_right:
                    pos = pager.getCurrentItem();
                    pager.setCurrentItem(pos+1,true);
                    break;
            }
        }
    };
}
