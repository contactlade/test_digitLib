package work.example.test_digitlib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class Title_Fragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_title, container, false);
		
		
		GridView grid = (GridView) view.findViewById(R.id.gridview);		
		

		
		// connecting the ImageAdapter to the gridview
		grid.setAdapter(new ImageAdapter(view.getContext()));
		return view;
		
		
	}



	
	
	
	
	
	
	
	/*
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		GridView grid = (GridView) findViewById(R.id.gridview);
		return inflater.inflate(R.layout.fragment_title, container, false);
		
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
			//setContentView(R.layout.fragment_title);
		
	
	}*/

	
	
	
	

}
