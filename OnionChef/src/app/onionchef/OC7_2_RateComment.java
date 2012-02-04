package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OC7_2_RateComment extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc7_3_ratecomment);
		
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
		//TopBar End
		
		ImageView image_Rate1 = (ImageView) findViewById(R.id.image_Rate1);
		image_Rate1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent

			}
		});
		
		ImageView image_Rate2 = (ImageView) findViewById(R.id.image_Rate2);
		image_Rate2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent

			}
		});
		
		ImageView image_Rate3 = (ImageView) findViewById(R.id.image_Rate3);
		image_Rate3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent

			}
		});
		
		ImageView image_Rate4 = (ImageView) findViewById(R.id.image_Rate4);
		image_Rate4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent

			}
		});
		
		ImageView image_Rate5 = (ImageView) findViewById(R.id.image_Rate5);
		image_Rate5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent

			}
		});

		Button button_Cancel = (Button) findViewById(R.id.button_Cancel);
		button_Cancel.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
				Intent nextPage = new Intent(getApplicationContext(), OC4_Restaurant.class);

	            startActivity(nextPage);
			}
		});
		
		Button button_Submit = (Button) findViewById(R.id.button_Submit);
		button_Submit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
				Intent nextPage = new Intent(getApplicationContext(), OC5_Dish.class);

	            startActivity(nextPage);
			}
		});
		
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
		
		ImageView button_Discover = (ImageView) findViewById(R.id.button_Discover);
		button_Discover.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
	            Intent goToDiscover = new Intent(getApplicationContext(), OC7_0_Discover.class);

	            startActivity(goToDiscover);
			}
		});
		//BottomBar End
	}
}
