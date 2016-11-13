package com.example.ansam.adaptersexample;

import android.content.Context;
import android.print.PrintAttributes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ansam on 11/13/2016.
 */

public class adapter extends BaseAdapter {
    private Context context;
    TextView header,subTitle;
    ImageView image;
    View view;
    String []SubTitles={"SnowWhite","Cinderella","Aurora","Ariel","Bella","Jasmine","Pacahontas","Mulan"};
    String Title="Princess of Diseny";
    Integer []Images={R.drawable.snow,R.drawable.cinderella,R.drawable.aurora,R.drawable.ariel,
    R.drawable.bella,R.drawable.jasmine,R.drawable.pacahontas,R.drawable.mulan};
    public adapter(Context c){
        this.context=c;
    }
    @Override
    public int getCount() {
        return SubTitles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(position%2==0){
            view=inflater.inflate(R.layout.item2,parent,false);
            header=(TextView)view.findViewById(R.id.title);
            subTitle=(TextView)view.findViewById(R.id.subTitle);
            image=(ImageView)view.findViewById(R.id.image);
            header.setText(Title);
            subTitle.setText(SubTitles[position]);
            image.setImageResource(Images[position]);

        }
        else{
            view=inflater.inflate(R.layout.item1,parent,false);
            header=(TextView)view.findViewById(R.id.title);
            subTitle=(TextView)view.findViewById(R.id.subTitle);
            image=(ImageView)view.findViewById(R.id.image);
            header.setText(Title);
            subTitle.setText(SubTitles[position]);
            image.setImageResource(Images[position]);

        }
        return view;
    }
}
