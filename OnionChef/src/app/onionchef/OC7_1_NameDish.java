package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OC7_1_NameDish extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc7_2_namedish);
		
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
		
		Button button_Submit = (Button) findViewById(R.id.button_Submit);
		button_Submit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
				Intent nextPage = new Intent(getApplicationContext(), OC7_2_RateComment.class);

	            startActivity(nextPage);
			}
		});
		
		//clicking on either of the following buttons replaces the text of input_DishName to whatever the text of label_DishNameOther is
		ImageView image_OtherDish1 = (ImageView) findViewById(R.id.image_OtherDish1);
		image_OtherDish1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		TextView label_DishNameOther1 = (TextView) findViewById(R.id.label_DishNameOther1);
		label_DishNameOther1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		//clicking on either of the following buttons replaces the text of input_DishName to whatever the text of label_DishNameOther is
		ImageView image_OtherDish2 = (ImageView) findViewById(R.id.image_OtherDish2);
		image_OtherDish2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		TextView label_DishNameOther2 = (TextView) findViewById(R.id.label_DishNameOther2);
		label_DishNameOther2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		//clicking on either of the following buttons replaces the text of input_DishName to whatever the text of label_DishNameOther is
		ImageView image_OtherDish3 = (ImageView) findViewById(R.id.image_OtherDish3);
		image_OtherDish3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
				
			}
		});
		
		TextView label_DishNameOther3 = (TextView) findViewById(R.id.label_DishNameOther3);
		label_DishNameOther3.setOnClickListener(new View.OnClickListener() {
			
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
		//BottomBar End		
	}
}
