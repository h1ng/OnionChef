package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;

public class OC2_LogIn extends Activity {
	
	EditText input_Name;
	EditText input_Password;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc2_login);
		
		input_Name = (EditText) findViewById(R.id.input_Name);
		input_Password = (EditText) findViewById(R.id.input_Password);
		
		//Listening to button event
		ImageView button_Back = (ImageView) findViewById(R.id.button_Back);
		button_Back.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				finish();
			}
		});
		
		Button button_LogIn = (Button) findViewById(R.id.button_LogIn);
		button_LogIn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToNearbyRestaurants = new Intent(getApplicationContext(), OC3_NearbyRestaurants.class);

                startActivity(goToNearbyRestaurants);
			}
		});
		
	}
}
