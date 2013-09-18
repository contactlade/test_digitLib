
/*
 * This adapter is used to connect d gridview to d images dat appear on the new release, 
 * More Titles, and library fragments
 * */
package work.example.test_digitlib;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

	private Context context;
	
	
	public ImageAdapter(Context context){
		
		this.context = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//ImageView imageView;
		
		View gridview;
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		
		if (convertView == null){
			
			gridview = new View(context);
			
		gridview = inflater.inflate(R.layout.price, null);
		
		TextView textview = (TextView) gridview.findViewById(R.id.image_text);
		textview.setText(mThumbText[position]);
		
		
		ImageView image = (ImageView) gridview.findViewById(R.id.image_icon);
		
		
			
			
			//imageView = new ImageView(mContext);
			//imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
			//imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			//imageView.setPadding(8, 8, 8, 8);
		
		//image.setLayoutParams(new GridView.LayoutParams(200, 200));
		image.setScaleType(ImageView.ScaleType.CENTER_CROP);
		image.setPadding(8, 8, 8, 8);
		image.setImageResource(mThumbIds[position]);	
		}
		
		else{
			
			gridview = (View) convertView;
			
		}
		
		
		
		//imageView.setImageResource(mThumbIds[position]);
		//return imageView;
		
		
				return gridview;
		
	}
	
	
	
	//reference to images from an array
	
	private Integer[] mThumbIds ={
		
		R.drawable.jack1, R.drawable.jack2,
		R.drawable.jack3, R.drawable.jack4,
		R.drawable.jack5, R.drawable.jack6,
		R.drawable.jack7, R.drawable.jack8,
		R.drawable.jack9, R.drawable.jack10,
		R.drawable.jack11, R.drawable.jack12,
		
			
			
	} ;
	
	
	private String[] mThumbText ={
			
			"Price: $2.99", "Price: $1.99", "Price: $2.99", "Price: $3.99",
			"Price: $1.99", "Price: $0.99", "Price: $2.99",  "Price: $1.99",
			"Price: $2.99",	"Price: $2.99",	"Price: $2.99",	"Price: $0.99",
			
			
	};
	

}
