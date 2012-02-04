package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

public class OC5_Dish extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc5_dish);
		
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
		
		ImageView button_UploadPic = (ImageView) findViewById(R.id.button_UploadPic);
		button_UploadPic.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		ImageView button_Favourite = (ImageView) findViewById(R.id.button_Favourite);
		button_Favourite.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		//TopBar End
		
		Button button_RateComment = (Button) findViewById(R.id.button_RateComment);
		button_RateComment.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				Intent goToRateComment = new Intent(getApplicationContext(), OC7_2_RateComment.class);

                startActivity(goToRateComment);
			}
		});

		//for reporting users for spam/viewing profile
		ImageView button_UserAction1 = (ImageView) findViewById(R.id.button_UserPic1);
		button_UserAction1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		TextView label_UserName1 = (TextView) findViewById(R.id.label_UserName1);
		label_UserName1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		ImageView button_UserAction2 = (ImageView) findViewById(R.id.button_UserPic1a);
		button_UserAction2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		TextView label_UserName2 = (TextView) findViewById(R.id.label_UserName1a);
		label_UserName2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		ImageView button_UserAction3 = (ImageView) findViewById(R.id.button_UserPic1b);
		button_UserAction3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		TextView label_UserName3 = (TextView) findViewById(R.id.label_UserName1b);
		label_UserName3.setOnClickListener(new View.OnClickListener() {
			
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