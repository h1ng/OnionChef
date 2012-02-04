package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class OC6_Profile extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc6_profile);
		
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
				
				Button button_EditProfile = (Button) findViewById(R.id.button_EditProfile);
				button_EditProfile.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						
					}
				});
				//TopBar End
				
				//for launching gallery to change profile pic
				ImageView image_ProfilePic = (ImageView) findViewById(R.id.image_ProfilePic);
				image_ProfilePic.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						
					}
				});
				
				
				ImageView image_Dish1 = (ImageView) findViewById(R.id.image_Dish1);
				image_Dish1.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						Intent goToDish = new Intent(getApplicationContext(), OC5_Dish.class);

			            startActivity(goToDish);	
					}
				});
				
				//to unfavourite a favourite dish (removes it from list of favourites)
				ImageView button_UnFavourite1 = (ImageView) findViewById(R.id.button_UnFavourite1);
				button_UnFavourite1.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						
					}
				});
		
				ImageView image_Dish2 = (ImageView) findViewById(R.id.image_Dish2);
				image_Dish2.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						Intent goToDish = new Intent(getApplicationContext(), OC5_Dish.class);

			            startActivity(goToDish);	
					}
				});
				
				//to unfavourite a favourite dish (removes it from list of favourites)
				ImageView button_UnFavourite2 = (ImageView) findViewById(R.id.button_UnFavourite2);
				button_UnFavourite2.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						
					}
				});
		
				ImageView image_Dish3 = (ImageView) findViewById(R.id.image_Dish3);
				image_Dish3.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						Intent goToDish = new Intent(getApplicationContext(), OC5_Dish.class);

			            startActivity(goToDish);	
					}
				});
				
				//to unfavourite a favourite dish (removes it from list of favourites)
				ImageView button_UnFavourite3 = (ImageView) findViewById(R.id.button_UnFavourite3);
				button_UnFavourite3.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						//Starting a new Intent
						
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
