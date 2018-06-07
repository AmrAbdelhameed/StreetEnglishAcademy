package com.example.amr.streetenglishacademy;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static String FACEBOOK_URL = "https://www.facebook.com/Street.English.Academy/";
    public static String FACEBOOK_PAGE_ID = "Street.English.Academy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, new FirstFragment()).commit();

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
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();
        if (id == R.id.nav_first_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new FirstFragment()).commit();
        } else if (id == R.id.nav_second_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new SecondFragment()).commit();
        }
//        else if (id == R.id.nav_test_layout) {
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new TestFragment()).commit();
//        }
        else if (id == R.id.nav_third_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new ThirdFragment()).commit();
        } else if (id == R.id.nav_team_sea) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new AboutTeamFragment()).commit();
        } else if (id == R.id.nav_share1) {
            String num = "01158748131";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", num, null)));
        } else if (id == R.id.nav_share2) {
            String num = "01022173649";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", num, null)));
        } else if (id == R.id.nav_sha4) {
            String num = "01221152518";
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", num, null)));
        } else if (id == R.id.nav_insta) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/streetenglishacademy/")));
        } else if (id == R.id.nav_gmail) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO
                    , Uri.fromParts("mailto", "streetenglishacademy999@gmail.com", null));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "");
            startActivity(Intent.createChooser(emailIntent, "Send email..."));
        } else if (id == R.id.nav_share) {
//            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Street.English.Academy/")));
            Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
            String facebookUrl = getFacebookPageURL(MainActivity.this);
            facebookIntent.setData(Uri.parse(facebookUrl));
            startActivity(facebookIntent);
        } else if (id == R.id.nav_share3) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCeu010bn7_v83HQ1xo2vr6Q/")));
        } else if (id == R.id.nav_review) {
//            Intent i = new Intent(MainActivity.this, Login.class);
//            startActivity(i);
            Toast.makeText(this, "Google Form Feedback", Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/0B4Db4KEZ1GtzNGN0ZHNUQjA1cDQ")));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
