package com.example.garbagelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    Context context;
    ArrayList<User> usersList;

    public recyclerAdapter(Context context, ArrayList<User> usersList) {
        this.context = context;
        this.usersList = usersList;
    }
    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_items, parent, false);
        return new recyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        holder.tvBin.setText(usersList.get(position).getGarbageBin());
        holder.tvLvl.setText(usersList.get(position).getGarbageLvl());
        holder.tvStatus.setText(usersList.get(position).getGarbageStatus());

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvBin,tvLvl, tvStatus;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBin = itemView.findViewById(R.id.textView2);
            tvLvl = itemView.findViewById(R.id.textView4);
            tvStatus = itemView.findViewById(R.id.textView6);
        }
    }
}
