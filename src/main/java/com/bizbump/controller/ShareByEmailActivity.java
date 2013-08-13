package com.bizbump.controller;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.bizbump.R;
import com.bizbump.view.fragment.CardDetails;
import com.bizbump.view.fragment.share.ShareByEmail;

/**
 * Created by Shane on 8/8/13.
 */
public class ShareByEmailActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Check if container exists
        if(findViewById(R.id.fragment_container) != null){
            //Now add some fragment.
            //Return if already opened or something like that.
            if(savedInstanceState != null){
                return;
            }
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new ShareByEmail()).commit();
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}