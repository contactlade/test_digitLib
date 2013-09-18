/* This is d main Activity of the App, 
 * This is where all the fragments are initialised and loaded. 
 * also the action bar is initialised here */



package work.example.test_digitlib;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;



public  class MainActivity extends ActionBarActivity implements ActionBar.OnNavigationListener {

	ActionBar actionBar1;
	SpinnerAdapter spin1;
	
	Fragment frag1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		// this code is used to create the Home Fragments
		// which happens to be d first fragments u see on the screen
		FragmentManager ftms = getSupportFragmentManager();
		FragmentTransaction ft = ftms.beginTransaction();		
		Home_Fragment main_frag = new Home_Fragment();
		ft.add(R.id.main_frag, main_frag);
		ft.commit();
		
		
		
		// this code is used to set up d actionbar with menus and 
		//also to populate d dropdown navigation using arrayadapter
		actionBar1 = getSupportActionBar();
		actionBar1.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);		
		 spin1 = ArrayAdapter.createFromResource(this,R.array.spin_aray,
		          R.layout.support_simple_spinner_dropdown_item);	
		
		actionBar1.setListNavigationCallbacks(spin1, this);
		
		
		
		
		
	}
	
	
	




	// mOnNavigationListener = new OnNavigationListener(){
		
	
		// this is click method of the drop down navigation
		// which loads the diff fragment has U click them
		
		@Override
		public boolean onNavigationItemSelected(int position, long itemId){
			
			Fragment newFragment;
			
			
			int d = position;
			
			if(d == 0) {
				
				newFragment = new Home_Fragment();
				
								
			}
			
			else if( d == 1){
				
				newFragment = new New_Release_Fragment();
			}
			
			else if(d == 2){
				
				newFragment = new Title_Fragment();
			}
			
			else if(d == 3){
				
				newFragment = new Library_Fragment();
			}
			
			
			else {
				newFragment = new Home_Fragment();
				
			}
			
			//replacing d previous fragments here
			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
			transaction.replace(R.id.main_frag, newFragment);
			transaction.addToBackStack(null);
			
			transaction.commit();
			return true;
			
			
		}
		
	// };
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar 
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	

}
