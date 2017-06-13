package com.codingblocks.lists;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rishabhkhanna on 13/06/17.
 */

public class StudentAdapter extends BaseAdapter {

    ArrayList<Student> studentArrayList;
    Context context;
    public static final String TAG = "StuddentAdapter";

    public StudentAdapter(ArrayList<Student> studentArrayList, Context context) {
        this.studentArrayList = studentArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {

        return studentArrayList.size();
    }

    @Override
    public Student getItem(int position) {
        return studentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = li.inflate(R.layout.tupple_layout, null);
        }


        Student thisStudent = getItem(position);

        Log.d(TAG, "getView: " + position + " : " + convertView);



        ((TextView)convertView.findViewById(R.id.tvName)).setText(thisStudent.getName());
        ((TextView)convertView.findViewById(R.id.tvCourse)).setText(thisStudent.getCourse());

        return convertView;
    }
}
