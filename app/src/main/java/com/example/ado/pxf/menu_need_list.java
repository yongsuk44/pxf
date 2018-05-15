package com.example.ado.pxf;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class menu_need_list extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView name;
    String string;
    int stat,img;
    ImageView[] imgView = new ImageView[30];

    //String name2[] = {"기본 준비물","기본 준비물", "기본 원형","기본 원형","기본 원형","기본 원형","기본 원형","기본 원형","기본 원형","기본 치수", "드레이핑 상의", "드레이핑 하의","드레이핑 하의", "카라 ＆ 다트","바디 선 치기","드레프팅 상의","드레프팅 상의","소매","소매","드레프팅 하의","드레프팅 하의","드레프팅 하의","드레프팅 하의","원피스","원피스","홈 패션","홈 패션","홈 패션","악세사리","악세사리"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_need_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        name = (TextView)findViewById(R.id.menu_need_list_tv);
        LinearLayout Li1 = (LinearLayout)findViewById(R.id.lll1);
        LinearLayout Li2 = (LinearLayout)findViewById(R.id.lll2);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,800);
        params.setMargins(0,0,0,30);
       Intent intent = getIntent();
        string = intent.getStringExtra("set");
        name.setText(string);

            img = intent.getIntExtra("img",0);

        switch (string){
            case "기본 준비물":
                imgView[0] = new ImageView(this);
                imgView[0].setImageResource(R.drawable.draifing1);

                imgView[1] = new ImageView(this);
                imgView[1].setImageResource(R.drawable.draifting1);

                Li1.addView(imgView[0],params);
                imgView[0].setOnClickListener(ins);

                Li2.addView( imgView[1],params);
                imgView[1].setOnClickListener(ins);
                break;
            case "기본 원형":
                imgView[2] = new ImageView(this);
                imgView[2].setImageResource(R.drawable.bodice1_draifing);

                imgView[3] = new ImageView(this);
                imgView[3].setImageResource(R.drawable.bodice1_draifting);

                imgView[4] = new ImageView(this);
                imgView[4].setImageResource(R.drawable.coat1_draifting);

                imgView[5] = new ImageView(this);
                imgView[5].setImageResource(R.drawable.pants1_draifting);

                imgView[6] = new ImageView(this);
                imgView[6].setImageResource(R.drawable.skirt1_draifting);

                imgView[7]= new ImageView(this);
                imgView[7].setImageResource(R.drawable.sleeve1_draifting);

                imgView[8] = new ImageView(this);
                imgView[8].setImageResource(R.drawable.torso1_draifting);

                Li1.addView(imgView[2],params);
                imgView[2].setOnClickListener(ins);

                Li1.addView(imgView[4],params);
                imgView[4].setOnClickListener(ins);

                Li1.addView(imgView[6],params);
                imgView[6].setOnClickListener(ins);

                Li1.addView(imgView[8],params);
                imgView[8].setOnClickListener(ins);

                Li2.addView(imgView[3],params);
                imgView[3].setOnClickListener(ins);

                Li2.addView(imgView[5],params);
                imgView[5].setOnClickListener(ins);

                Li2.addView(imgView[7],params);
                imgView[7].setOnClickListener(ins);
            break;
            case "기본 치수":
                imgView[9] = new ImageView(this);
                imgView[9].setImageResource(R.drawable.size1);
                Li1.addView(imgView[9],params);
                imgView[9].setOnClickListener(ins);
                break;
            case "드레이핑 하의":
                imgView[10]= new ImageView(this);
                imgView[10].setImageResource(R.drawable.goard1_draifing);
                Li1.addView(imgView[10],params);
                imgView[10].setOnClickListener(ins);

                imgView[11] = new ImageView(this);
                imgView[11].setImageResource(R.drawable.skirt1_draifing);
                Li2.addView(imgView[11],params);
                imgView[11].setOnClickListener(ins);
                break;
            case "바디 선 치기":
                imgView[12] = new ImageView(this);
                imgView[12].setImageResource(R.drawable.line1_drafing);
                Li1.addView(imgView[12],params);
                imgView[12].setOnClickListener(ins);
                break;
            case "카라 ＆ 다트":
                imgView[13] = new ImageView(this);
                imgView[13].setImageResource(R.drawable.collar1_draifing);
                Li1.addView(imgView[13],params);
                imgView[13].setOnClickListener(ins);
                break;
            case "드레이핑 상의":
                imgView[14] = new ImageView(this);
                imgView[14].setImageResource(R.drawable.gather1_draifing);
                Li1.addView(imgView[14],params);
                imgView[14].setOnClickListener(ins);
                break;
            case "드레프팅 하의":
                imgView[15] = new ImageView(this);
                imgView[15].setImageResource(R.drawable.highskirt1_draifting);
                Li1.addView(imgView[15],params);
                imgView[15].setOnClickListener(ins);

                imgView[16] = new ImageView(this);
                imgView[16].setImageResource(R.drawable.pantalonpants1_draifting);
                Li2.addView(imgView[16],params);
                imgView[16].setOnClickListener(ins);

                imgView[17] = new ImageView(this);
                imgView[17].setImageResource(R.drawable.tailoredpants1_draifting);
                Li1.addView(imgView[17],params);
                imgView[17].setOnClickListener(ins);

                imgView[18] = new ImageView(this);
                imgView[18].setImageResource(R.drawable.tightskirt1_draifting);
                Li2.addView(imgView[18],params);
                imgView[18].setOnClickListener(ins);
                break;
            case "원피스":
                imgView[19] = new ImageView(this);
                imgView[19].setImageResource(R.drawable.drapedonepiece1_draifting);
                Li1.addView(imgView[19],params);
                imgView[19].setOnClickListener(ins);
                imgView[20] = new ImageView(this);
                imgView[20].setImageResource(R.drawable.highneckonepiece1_draifting);
                Li2.addView(imgView[20],params);
                imgView[20].setOnClickListener(ins);
                break;

            case "소매":
                imgView[21] = new ImageView(this);
                imgView[21].setImageResource(R.drawable.raglansleevecoat1_draifting);
                Li1.addView(imgView[21],params);
                imgView[21].setOnClickListener(ins);
                imgView[22] = new ImageView(this);
                imgView[22].setImageResource(R.drawable.trenchcoat1_draifting);
                Li2.addView(imgView[22],params);
                imgView[22].setOnClickListener(ins);
                break;

            case "드레프팅 상의":
                imgView[23] = new ImageView(this);
                imgView[23].setImageResource(R.drawable.rollcollarblouse1_draifting);
                Li1.addView(imgView[23],params);
                imgView[23].setOnClickListener(ins);
                imgView[24] = new ImageView(this);
                imgView[24].setImageResource(R.drawable.yshirtsblouse1_draifting);
                Li2.addView(imgView[24],params);
                imgView[24].setOnClickListener(ins);
                break;
            case "홈 패션":
                imgView[25] = new ImageView(this);
                imgView[25].setImageResource(R.drawable.making1_homefashion);
                Li1.addView(imgView[25],params);
                imgView[25].setOnClickListener(ins);
                imgView[26] = new ImageView(this);
                imgView[26].setImageResource(R.drawable.slippers_homefashion);
                Li2.addView(imgView[26],params);
                imgView[26].setOnClickListener(ins);
                imgView[27] = new ImageView(this);
                imgView[27].setImageResource(R.drawable.sofa1_homefashion);
                Li1.addView(imgView[27],params);
                imgView[27].setOnClickListener(ins);
                break;
            case "악세사리":
                imgView[28] = new ImageView(this);
                imgView[28].setImageResource(R.drawable.bag_acce);
                Li1.addView(imgView[28],params);
                imgView[28].setOnClickListener(ins);
                imgView[29] = new ImageView(this);
                imgView[29].setImageResource(R.drawable.pouch1_acce);
                Li2.addView(imgView[29],params);
                imgView[29].setOnClickListener(ins);
                break;
        }




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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_need_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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


    View.OnClickListener ins = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          for(int i =0; i<imgView.length; i++){
              if (v == imgView[i]) {
                  setimg(i);
              }
          }
        }
    };

    public void setimg(int i){
        Intent intent;
        intent = new Intent(menu_need_list.this, menu_slide.class);
        intent.putExtra("set"   ,"기본");
        intent.putExtra("img", i);
        startActivity(intent);
    }
}
