package com.example.tz.prototype1;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView mainTextView;
    ImageButton OKButton;
    ImageButton HomeButton;
    ImageButton arrowUpButton;
    ImageButton arrowDownButton;
    ImageButton arrowLeftButton;
    ImageButton arrowRightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mainTextView = (TextView) findViewById(R.id.buttonpushtext);
        mainTextView.setVisibility(View.INVISIBLE);
        mainTextView.setText("");


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
                mainTextView.setVisibility(View.VISIBLE);
                mainTextView.setText("Home Button Pressed!");
                break;

            case R.id.OKButton:
                mainTextView.setVisibility(View.VISIBLE);
                mainTextView.setText("OK Button Pressed!");
                break;

            case R.id.arrowUpButton:
                mainTextView.setVisibility(View.VISIBLE);
                mainTextView.setText("Up Arrow Pressed!");
                break;

            case R.id.arrowDownButton:
                mainTextView.setVisibility(View.VISIBLE);
                mainTextView.setText("Down Arrow Pressed!");
                break;

            case R.id.arrowLeftButton:
                mainTextView.setVisibility(View.VISIBLE);
                mainTextView.setText("Left Arrow Pressed!");
                break;

            case R.id.arrowRightButton:
                mainTextView.setVisibility(View.VISIBLE);
                mainTextView.setText("Right Arrow Pressed!");
                break;

            default:
                break;

        }
    }
}
