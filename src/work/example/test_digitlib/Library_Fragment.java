package work.example.test_digitlib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Library_Fragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
	View view = inflater.inflate(R.layout.fragment_library, container, false);
	
	GridView grid_2 = (GridView) view.findViewById(R.id.gridview);
	

	
	// connecting the ImageAdapter to the gridview
	grid_2.setAdapter(new ImageAdapter(view.getContext()));
	
	return view;
	}
		
	

}
