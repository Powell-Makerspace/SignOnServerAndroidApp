package org.powellmakerspace.signonserver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import io.swagger.client.model.Member;

public class jsonAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    List<Member> allMemberList;

    public jsonAdapter(Context c, List<Member> allMemberList){
        this.allMemberList = allMemberList;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return allMemberList.size();
    }

    @Override
    public  Object getItem(int position){
        return allMemberList.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View v = mInflater.inflate(R.layout.json_adapter,null);

        TextView memberNameTextView = (TextView) v.findViewById(R.id.memberName);

        memberNameTextView.setText(allMemberList.get(position).getMemberName());

        return v;

    }
}


