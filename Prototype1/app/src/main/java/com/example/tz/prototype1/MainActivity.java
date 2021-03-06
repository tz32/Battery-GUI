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
import static com.example.tz.prototype1.R.id.imageView;


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
    ImageButton powerButton;
    int currentScreen;
    boolean screenOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cochlear_logo);
        imageView.setVisibility(View.INVISIBLE);
        screenOn = false;

        currentScreen = 0;

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

        powerButton = (ImageButton) findViewById(R.id.powerButton);
        powerButton.setOnClickListener(this);

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

        // 0: logo
        // 1: home_unplugged
        // 2: home_charging
        // 3: implant_history
        // 4: charger_history
        // 5: charger_status
        // 6: inplant_status
        // 7: settings


        switch (v.getId()) {

            case R.id.homeButton:
                if (screenOn) {
                    imageView.setImageResource(R.drawable.home_unplugged);
                    currentScreen = 1;
                }
                break;

            case R.id.OKButton:
                if (screenOn)
                {
                    imageView.setImageResource(R.drawable.home_charging);
                    currentScreen = 2;
                }
                break;

            case R.id.lowerLeftSelect:
                if (screenOn)
                {
                    switch (currentScreen)
                    {
                        case 0: // Logo
                            break;
                        case 1: // Home Unplugged
                            // Implant Status
                            imageView.setImageResource(R.drawable.implant_status);
                            currentScreen = 6;
                            break;
                        case 2: // Home Charging
                            // Implant Status
                            imageView.setImageResource(R.drawable.implant_status);
                            currentScreen = 6;
                            break;
                        case 3: // Implant History
                            // Settings
                            imageView.setImageResource(R.drawable.settings_static);
                            currentScreen = 7;
                            break;
                        case 4: // Charger History
                            // Implant History
                            imageView.setImageResource(R.drawable.implant_history);
                            currentScreen = 3;
                            break;
                        case 5: // Charger Status
                            // Charger History
                            imageView.setImageResource(R.drawable.charger_history);
                            currentScreen = 4;
                            break;
                        case 6: // Implant Status
                            // Settings
                            imageView.setImageResource(R.drawable.charger_status);
                            currentScreen = 5;
                            break;
                        case 7: // Settings
                            // Home Unplugged
                            imageView.setImageResource(R.drawable.home_unplugged);
                            currentScreen = 1;
                            break;
                    }

                }
                break;

            case R.id.lowerRightSelect:
                if (screenOn)
                {
                    switch (currentScreen)
                    {
                        case 0: // Logo
                            break;
                        case 1: // Home Unplugged
                            // Implant Status
                            imageView.setImageResource(R.drawable.settings_static);
                            currentScreen = 7;
                            break;
                        case 2: // Home Charging
                            // Implant Status
                            imageView.setImageResource(R.drawable.settings_static);
                            currentScreen = 7;
                            break;
                        case 3: // Implant History
                            // Charger History
                            imageView.setImageResource(R.drawable.charger_history);
                            currentScreen = 4;
                            break;
                        case 4: // Charger History
                            // Charger Status
                            imageView.setImageResource(R.drawable.charger_status);
                            currentScreen = 5;
                            break;
                        case 5: // Charger Status
                            // Implant Status
                            imageView.setImageResource(R.drawable.implant_status);
                            currentScreen = 6;
                            break;
                        case 6: // Implant Status
                            // Home
                            imageView.setImageResource(R.drawable.home_unplugged);
                            currentScreen = 1;
                            break;
                        case 7: // Settings
                            // Implant History
                            imageView.setImageResource(R.drawable.implant_history);
                            currentScreen = 3;
                            break;
                    }
                }
                break;

            case R.id.arrowUpButton:
                break;

            case R.id.arrowDownButton:
                break;

            case R.id.arrowLeftButton:
                break;

            case R.id.arrowRightButton:
                break;

            case R.id.powerButton:
                if (screenOn)
                {
                    imageView.setVisibility(View.INVISIBLE);
                    screenOn = false;
                    break;
                }
                else
                {
                    imageView.setVisibility(View.VISIBLE);
                    screenOn = true;
                    break;
                }

            default:
                break;

        }
    }
}
