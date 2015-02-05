package com.example.tz.prototype1;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.tz.prototype1.R.id.home_unplugged;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    ImageView imageView;
    ImageButton OKButton;
    ImageButton HomeButton;
    ImageButton arrowUpButton;
    ImageButton arrowDownButton;
    ImageButton arrowLeftButton;
    ImageButton arrowRightButton;
    ImageButton lowerLeftSelect;
    ImageButton lowerRightSelect;
    int currentScreen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.home_unplugged);
        imageView.setVisibility(View.VISIBLE);

        OKButton = (ImageButton) findViewById(R.id.OKButton);
        OKButton.setOnClickListener(this);

        HomeButton = (ImageButton) findViewById(R.id.homeButton);
        HomeButton.setOnClickListener(this);

        arrowUpButton = (ImageButton) findViewById(R.id.arrowUpButton);
        arrowUpButton.setOnClickListener(this);

        arrowDownButton = (ImageButton) findViewById(R.id.arrowDownButton);
        arrowDownButton.setOnClickListener(this);

        arrowLeftButton = (ImageButton) findViewById(R.id.arrowLeftButton);
        arrowLeftButton.setOnClickListener(this);

        arrowRightButton = (ImageButton) findViewById(R.id.arrowRightButton);
        arrowRightButton.setOnClickListener(this);

        lowerLeftSelect = (ImageButton) findViewById(R.id.lowerLeftSelect);
        lowerLeftSelect.setOnClickListener(this);

        lowerRightSelect = (ImageButton) findViewById(R.id.lowerRightSelect);
        lowerRightSelect.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.homeButton:
                imageView.setImageResource(R.drawable.home_unplugged);
                break;

            case R.id.OKButton:
                imageView.setImageResource(R.drawable.home_charging);
                break;

            case R.id.arrowUpButton:
                break;

            case R.id.arrowDownButton:
                break;

            case R.id.arrowLeftButton:
                break;

            case R.id.arrowRightButton:
                break;

            default:
                break;

        }
    }
}
