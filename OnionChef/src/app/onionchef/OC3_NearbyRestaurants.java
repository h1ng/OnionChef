package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OC3_NearbyRestaurants extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc3_nearbyrestaurants);
		
		//Listening to button event
		//TopBar Start
		ImageView button_Profile = (ImageView) findViewById(R.id.button_Profile);
		button_Profile.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToProfile = new Intent(getApplicationContext(), OC6_Profile.class);

                startActivity(goToProfile);
			}
		});
		
		ImageView button_Refresh = (ImageView) findViewById(R.id.button_Refresh);
		button_Refresh.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		//TopBar End
		
		//Restaurants start
		ImageView image_RestFrame1 = (ImageView) findViewById(R.id.image_RestFrame1);
		image_RestFrame1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToRestaurant = new Intent(getApplicationContext(), OC4_Restaurant.class);

                startActivity(goToRestaurant);
			}
		});
		
		TextView label_RestName1 = (TextView) findViewById(R.id.label_RestName1);
		label_RestName1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToRestaurant = new Intent(getApplicationContext(), OC4_Restaurant.class);

                startActivity(goToRestaurant);
			}
		});
		
		ImageView image_RestFrame2 = (ImageView) findViewById(R.id.image_RestFrame2);
		image_RestFrame2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToRestaurant = new Intent(getApplicationContext(), OC4_Restaurant.class);

                startActivity(goToRestaurant);
			}
		});
		
		TextView label_RestName2 = (TextView) findViewById(R.id.label_RestName2);
		label_RestName2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToRestaurant = new Intent(getApplicationContext(), OC4_Restaurant.class);

                startActivity(goToRestaurant);
			}
		});
		
		ImageView image_RestFrame3 = (ImageView) findViewById(R.id.image_RestFrame3);
		image_RestFrame3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToRestaurant = new Intent(getApplicationContext(), OC4_Restaurant.class);

                startActivity(goToRestaurant);
			}
		});
		
		TextView label_RestName3 = (TextView) findViewById(R.id.label_RestName3);
		label_RestName3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToRestaurant = new Intent(getApplicationContext(), OC4_Restaurant.class);

                startActivity(goToRestaurant);
			}
		});
		
	}	
}
