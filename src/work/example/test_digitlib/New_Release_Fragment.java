package work.example.test_digitlib;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class New_Release_Fragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_new_release, container, false);
		
		GridView grid_3 = (GridView) view.findViewById(R.id.gridview);
		
		
		
		// connecting the ImageAdapter to the gridview
		
			grid_3.setAdapter(new ImageAdapter(view.getContext()) );
			
			return view;
	}
		
	

}
