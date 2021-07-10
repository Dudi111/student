package com.example.recyclerclick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentHolder> {
    private ArrayList<Studentmodel> studentlist;
    private clicklistener clicklistener;



    public StudentAdapter(ArrayList<Studentmodel> studentlist, clicklistener clicklistener){
        this.studentlist=studentlist;
        this.clicklistener=clicklistener;

    }

    @NonNull

    @Override
    public StudentHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new StudentHolder(view, clicklistener);
    }

    @Override
    public void onBindViewHolder(@NonNull  StudentHolder holder, int position) {
     Studentmodel studentmodel=studentlist.get(position);
     holder.setdata(studentmodel);
    }

    @Override
    public int getItemCount() {

        return studentlist.size();
    }
}
