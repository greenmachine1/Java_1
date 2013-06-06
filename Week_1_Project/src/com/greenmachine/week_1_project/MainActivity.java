
package com.greenmachine.week_1_project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	LinearLayout linLayout;
	LinearLayout.LayoutParams layParams;
	EditText editText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

				

	       // setting our linear layout 
	       linLayout = new LinearLayout(this);
	       linLayout.setOrientation(LinearLayout.VERTICAL);
	       layParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
	       linLayout.setLayoutParams(layParams);

	       // creating a text view
	       TextView newTextView = new TextView(this);
	       newTextView.setText("Enter in your name:");
	       
	       // adding it to my subview
	       linLayout.addView(newTextView);
	       	       
	       // making a EditText place for entering your name
	       editText = new EditText(this);
	       editText.setHint("Enter your name here");
	       
	       // adding it to my subview
	       linLayout.addView(editText);
	       
	       // creating a button for entering your name
	       Button b = new Button(this);
	       b.setText("Enter your name.");
	       b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// do something inside here
			
			}
		});

	       
	       
	       
	       
	       
	       // sending the linLayout to the main view
	       setContentView(linLayout);
	       
	       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
