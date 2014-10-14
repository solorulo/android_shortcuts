package com.solorulo.shortcuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
        
    	//Add listener to add shortcut button
    	Button add = (Button) findViewById(R.id.buttonAddShortcut);
    	add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				addShortcut(); //Add shortcut on Home screen
			}
		});
    	
    	//Add listener to remove shortcut button
    	Button remove = (Button) findViewById(R.id.buttonRemoveShortcut);
    	remove.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				removeShortcut(); //Remove shortcut from Home screen
			}
		});    	
    }
    
    private void addShortcut() {
    	//Adding shortcut for MainActivity 
    	//on Home screen
		Intent shortcutIntent = new Intent();
		shortcutIntent.setClassName("com.nzuri.spot", "com.nzuri.spot.SplashActivity");
		shortcutIntent.setAction(Intent.ACTION_MAIN);

		Intent addIntent = new Intent();
		addIntent
				.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
//		addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "HelloWorldShortcut");
//		addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
//				Intent.ShortcutIconResource.fromContext(getApplicationContext(),
//						R.drawable.ic_launcher));

		addIntent
				.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
		getApplicationContext().sendBroadcast(addIntent);
    }
    
    private void removeShortcut() {
    	
    	//Deleting shortcut for MainActivity 
    	//on Home screen
//		Intent shortcutIntent = new Intent(getApplicationContext(),
//				MainActivity.class);
    	Intent shortcutIntent = new Intent();
    	shortcutIntent.setClassName("com.nzuri.spot", "com.nzuri.spot.SplashActivity");
		shortcutIntent.setAction(Intent.ACTION_MAIN);
		
		Intent addIntent = new Intent();
		addIntent
				.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
//		addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "HelloWorldShortcut");

		addIntent
				.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
		getApplicationContext().sendBroadcast(addIntent);
    }
    
}
