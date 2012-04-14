package com.koa.lunchtimer;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class LunchTimerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Typeface lcdtf = Typeface.createFromAsset(getAssets(),
        		"fonts/lcddot.ttf");
        TextView ttv = (TextView) findViewById(R.id.timerTextView);
        ttv.setTypeface(lcdtf);
        ttv.setTextColor(Color.GREEN);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.settings:
            	Intent myIntent = new Intent(this, Settings.class);
                startActivity(myIntent);
                return true;
            case R.id.help:
                showHelpPopup();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void showHelpPopup (){
//    LayoutInflater inflater = (LayoutInflater)
//    	    this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    	    PopupWindow pw = new PopupWindow(
//    	       inflater.inflate(R.layout.help_popup, null, false), 
//    	       100, 
//    	       100, 
//    	       true);
//    	    // The code below assumes that the root container has an id called 'main'
//    	    pw.showAtLocation(this.findViewById(R.id.settings), Gravity.CENTER, 0, 0); 
    	Context context = getApplicationContext();
    	CharSequence text = "Help Not Implemented";
    	int duration = Toast.LENGTH_SHORT;

    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
    }
    	    
}