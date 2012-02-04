package app.onionchef;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class OC0_LoadingScreen extends Activity {
    /** Called when the activity is first created. */
	private Thread loadingThread;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oc0_loadscreen);
        
        //loadscreen timeout
        final OC0_LoadingScreen sLoadingScreen = this;
		loadingThread = new Thread() {
			@Override
			public void run() {
				try {
					synchronized(this){
						
						wait(1500);
					}
				}catch(InterruptedException ex){
					
				}
				
				finish();
				Intent intent = new Intent();
				intent.setClass(sLoadingScreen, OC1_Register.class);
				startActivity(intent);
				stop();
			}
		};
		
		loadingThread.start();
    }
}