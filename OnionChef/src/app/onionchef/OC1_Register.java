package app.onionchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OC1_Register extends Activity {
	
	EditText input_Name;
	EditText input_Email;
	EditText input_Password;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oc1_register);
		
		input_Name = (EditText) findViewById(R.id.input_Name);
		input_Email = (EditText) findViewById(R.id.input_Email);
		input_Password = (EditText) findViewById(R.id.input_Password);
		
		//Listening to button event
		Button button_OCLogIn = (Button) findViewById(R.id.button_OCLogIn);
		button_OCLogIn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent goToLogIn = new Intent(getApplicationContext(), OC2_LogIn.class);

                startActivity(goToLogIn);
			}
		});
		
		Button button_FBLogIn = (Button) findViewById(R.id.button_FBLogIn);
		button_FBLogIn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), OC2_LogIn.class);
 
                startActivity(nextScreen);
			}
		});
		
		Button button_Submit = (Button) findViewById(R.id.button_Submit);	
		button_Submit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Starting a new Intent
                //Intent nextScreen = new Intent(getApplicationContext(), OC3_NearbyRestaurants.class);
 
                //Sending data to another Activity
               // nextScreen.putExtra("name", inputName.getText().toString());
                //nextScreen.putExtra("email", inputEmail.getText().toString());
 //
                Log.e("n", input_Name.getText()+"."+ input_Email.getText() + input_Password.getText());
 
                Intent goToNearbyRestaurants = new Intent(getApplicationContext(), OC3_NearbyRestaurants.class);

                startActivity(goToNearbyRestaurants);
			}
		});
		
	}
}
