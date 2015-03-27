package com.example.android.navigationdrawerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SnsPlusVN_05 on 3/26/2015.
 */
public class adapter_drawer extends BaseAdapter {
    Context context;
    List<DrawerItem> drawerItems;
    int resID;

    public adapter_drawer(Context context, List<DrawerItem> drawerItems, int resID)
    {
        this.context = context;
        this.drawerItems = drawerItems;
        this.resID = resID;
    }
    @Override
    public int getCount() {
        return drawerItems.size();
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

        ViewHolder holder = null;
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resID, parent, false);
            holder = new ViewHolder();
            holder.init(convertView);
            convertView.setTag(holder);
        }
        else
            holder = (ViewHolder) convertView.getTag();
        holder.setInfo(drawerItems.get(position));

        return convertView;
    }
    protected  class ViewHolder{
        TextView tvName;
        ImageView imageView;

        public void init(View view)
        {
            tvName = (TextView) view.findViewById(R.id.textView);
            imageView = (ImageView) view.findViewById(R.id.imageView);
        }
        public  void setInfo(DrawerItem item)
        {
            tvName.setText(item.get_name());
            imageView.setImageResource(item.get_image());
        }
    }
}
