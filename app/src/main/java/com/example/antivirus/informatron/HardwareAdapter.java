package com.example.antivirus.informatron;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class HardwareAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<HardwareObject> listStorage;

    public HardwareAdapter(Context context, List<HardwareObject> customizedListView) {
        layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }

    @Override
    public int getCount() {
        return listStorage.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder listViewHolder;
        if(convertView == null){
            listViewHolder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.hardware_cardview, parent, false);

            listViewHolder.hardware = (TextView)convertView.findViewById(R.id.header);
            listViewHolder.hardwareMeaning = (TextView)convertView.findViewById(R.id.header_value);
            convertView.setTag(listViewHolder);
        }else{
            listViewHolder = (ViewHolder)convertView.getTag();
        }
        listViewHolder.hardware.setText(listStorage.get(position).getHardware());
        listViewHolder.hardwareMeaning.setText(listStorage.get(position).getHardwareMeaning());

        return convertView;
    }

    static class ViewHolder{

        TextView hardware;
        TextView hardwareMeaning;
    }
}
