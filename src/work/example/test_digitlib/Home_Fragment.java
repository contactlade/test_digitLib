
/* this class is d Home fragment, dat appears on the screen first
 it displays d list of podcast and also the advert on the Home screen
 */



package work.example.test_digitlib;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.ListView;

public class Home_Fragment extends ListFragment {

	AnimationDrawable rocketSlide ;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		// inflating the layout 
		View view = inflater.inflate(R.layout.fragment_home, container, false);
		
		
		
		ListView list_2 = (ListView) view.findViewById(android.R.id.list);
		
		//connecting the listview to the customised list adapter
		// were the values are loaded
		list_2.setAdapter(new CustomListAdapter(view.getContext()));
		
		
		//return inflater.inflate(R.layout.fragment_home, container, false);
		

		
		// the Imageview in the xml layout is declared and animated by using
		// animationdrawable, then d sequence also started by the starter method
		  ImageView rocketImage = (ImageView) view.findViewById(R.id.advertContainer);
		  rocketImage.setBackgroundResource(R.drawable.slide);
		  rocketSlide = (AnimationDrawable) rocketImage.getBackground();
		  
		  rocketImage.post(new Starter());
		return view;
	}
	
	
	// this class is responsible for makin the adverts go in sequence
	   class Starter implements Runnable {

	        public void run() {
	           rocketSlide.start();        
	        }


	    }

	 

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		/* String[] podValues = new String[] {
			       "PodCast1", 
			       "PodCast2",
			       "PodCast3", "PodCast4"
			      
			    };
		 
		 setListAdapter( new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, podValues));		
	     */  		 
	}



	/* (non-Javadoc)
	 * @see android.support.v4.app.ListFragment#onListItemClick(android.widget.ListView, android.view.View, int, long)
	 */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}
	
	




}


