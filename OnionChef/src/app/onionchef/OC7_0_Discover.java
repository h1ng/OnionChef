package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OC7_0_Discover extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc7_1_picpreview);
		
		//Listening to button event
		//TopBar start
		ImageView button_Back = (ImageView) findViewById(R.id.button_Back);
		button_Back.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				finish();
			}
		});
		
		ImageView button_Forward = (ImageView) findViewById(R.id.button_Forward);
		button_Forward.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				Intent goToNameDish = new Intent(getApplicationContext(), OC7_1_NameDish.class);

	            startActivity(goToNameDish);
			}
		});
		//TopBar End
		
		//BottomBar Start
		ImageView button_User = (ImageView) findViewById(R.id.button_User);
		button_User.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		ImageView button_Chef = (ImageView) findViewById(R.id.button_Chef);
		button_Chef.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});

		ImageView button_Profile = (ImageView) findViewById(R.id.button_Profile);
		button_Profile.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
	            Intent goToProfile = new Intent(getApplicationContext(), OC6_Profile.class);

	            startActivity(goToProfile);
			}
		});	
		//BottomBar End
	}
}
