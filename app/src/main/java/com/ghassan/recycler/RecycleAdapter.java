package com.ghassan.recycler;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder>
{
    List<Friends> friendList;
    Activity mainActivty;

    public RecycleAdapter(List<Friends> friendList){
        this.friendList=friendList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.friends, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.data=friendList.get(position);
    holder.textViewCity.setText(String.valueOf(holder.data.getCity()));
    holder.textViewDateFriend.setText(String.valueOf(holder.data.getDob()));
    holder.textViewFriendName.setText(String.valueOf(holder.data.getName()));

    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView textViewFriendName, textViewCity, textViewDateFriend;
        Friends data;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewFriendName=itemView.findViewById(R.id.name);
            textViewCity=itemView.findViewById(R.id.city);
            textViewDateFriend=itemView.findViewById(R.id.dob);
        }
    }
}
