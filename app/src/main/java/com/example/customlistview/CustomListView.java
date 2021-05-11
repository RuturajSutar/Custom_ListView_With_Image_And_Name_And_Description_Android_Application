package com.example.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListView extends ArrayAdapter<String> {

    private String[] animalname;
    private String[] animaldesc;
    private Integer[] imgid;
    private Activity context;
    public CustomListView(Activity context, String[] animalname,String[] animaldesc,Integer[] imgid) {
        super(context, R.layout.listview_layout,animalname);
        this.context=context;
        this.animalname=animalname;
        this.animaldesc=animaldesc;
        this.imgid=imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(animalname[position]);
        viewHolder.tvw2.setText(animaldesc[position]);
        return r;
    }
    class ViewHolder{
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View v){
            tvw1=(TextView) v.findViewById(R.id.tvfruitname);
            tvw2=(TextView) v.findViewById(R.id.tvdesc);
            ivw=(ImageView)v.findViewById(R.id.imageView);
        }
    }
}
