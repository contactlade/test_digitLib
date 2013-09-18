
/*
 *This class is the customised Adapter for the ListView used to show d list items on the Home fragment
*/

package work.example.test_digitlib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
	private Context context;
	
	public CustomListAdapter(Context context){
		this.context = context;		
	}

	@Override
	public int getCount() {
		// the lenght of the array of objects ur loading
		return mThumbsId.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Tthis is d major place were d list item are connected to d array and loaded to d listview
		
		View listview;
		
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if (convertView == null){
			
			listview = new View(context);
			
			listview = inflater.inflate(R.layout.list_item, null);
			
			ImageView imagelist = (ImageView) listview.findViewById(R.id.listimage);
			
			imagelist.setImageResource(mThumbsId[position]);
			
			TextView textlist = (TextView) listview.findViewById(R.id.listitle);
			
			textlist.setText(mThumbsText[position]);
			
		}
			else{
				
				listview = (View) convertView;
			}
			
			
			
			
	
		
		return listview;
	}
	
	
	// the array of CD jacket
	private Integer[] mThumbsId = {
		
		
		R.drawable.jack1, R.drawable.jack2,
		R.drawable.jack3, R.drawable.jack4,
		R.drawable.jack5
	} ;
	
	// the array of CD title
	private String[] mThumbsText = {
			
			"Anticipating Evil", "Attitude", "Bible Seminar 2", 
			"Christian Consecration", "Christ Purpose in You"
			
	};

}
