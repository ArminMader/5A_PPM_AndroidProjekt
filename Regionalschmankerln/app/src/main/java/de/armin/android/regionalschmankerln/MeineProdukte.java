package de.armin.android.regionalschmankerln;

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

public class MeineProdukte extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meine_produkte);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



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
        getMenuInflater().inflate(R.menu.meine_produkte, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Angemeldetstartseite) {
            Intent i = new Intent(this, AngemeldetStartseite.class);
            startActivity(i);

        } else if (id == R.id.nav_Angemeldetprodukte) {
            Intent i = new Intent(this, AngemeldetProdukte.class);
            startActivity(i);

        } else if (id == R.id.nav_Angemeldetinformationen) {
            Intent i = new Intent(this, AngemeldetInformationen.class);
            startActivity(i);

        } else if (id == R.id.nav_Angemeldetkontakt) {
            Intent i = new Intent(this, AngemeldetKontakt.class);
            startActivity(i);

        } else if (id == R.id.nav_Angemeldetpartner) {
            Intent i = new Intent(this, AngemeldetPartner.class);
            startActivity(i);

        } else if (id == R.id.nav_meinprofil) {
            Intent i = new Intent(this, MeinProfil.class);
            startActivity(i);

        } else if (id == R.id.nav_meineprodukte) {
            Intent i = new Intent(this, MeineProdukte.class);
            startActivity(i);

        } else if (id == R.id.nav_Angemeldetimpressum) {
            Intent i = new Intent(this, AngemeldetImpressum.class);
            startActivity(i);

        } else if (id == R.id.nav_Angemeldetagbs) {
            Intent i = new Intent(this, AngemeldetAGBs.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void clickabmelden(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
