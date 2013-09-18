package work.example.test_digitlib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;



public class Title_Fragment_Test extends Fragment {

	
	

	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_title, container, false);
		
		
		GridView grid = (GridView) view.findViewById(R.id.gridview);
		
		grid.setAdapter(new ImageAdapter(view.getContext()));
		return view;
		
		
	}
	
	
	
	/*
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
			//setContentView(R.layout.fragment_title);
		
	
	}*/

	
	
	
	

}
