package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OC4_Restaurant extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc4_restaurant);
	
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
	
	Button button_CheckIn = (Button) findViewById(R.id.button_CheckIn);
	button_CheckIn.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Starting a new Intent
			finish();
		}
	});
	
	TextView label_PhoneNumber = (TextView) findViewById(R.id.label_PhoneNumber);
	label_PhoneNumber.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Starting a new Intent
            
		}
	});
	//TopBar End
	
	ImageView image_DishBig = (ImageView) findViewById(R.id.image_DishBig);
	image_DishBig.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Starting a new Intent
			Intent goToDish = new Intent(getApplicationContext(), OC5_Dish.class);

            startActivity(goToDish);
		}
	});
	
	//the following buttons changes the image of image_DishBig into their respective images when selected
	ImageView image_Dish1 = (ImageView) findViewById(R.id.image_Dish1);
	image_Dish1.setOnClickListener(new View.OnClickListener() {
		
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
			
		}
	});
	
	ImageView image_Dish3 = (ImageView) findViewById(R.id.image_Dish3);
	image_Dish3.setOnClickListener(new View.OnClickListener() {
	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Starting a new Intent
			
		}
	});
	
	ImageView image_Dish4 = (ImageView) findViewById(R.id.image_Dish4);
	image_Dish4.setOnClickListener(new View.OnClickListener() {
	
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
