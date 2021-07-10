package com.example.recyclerclick;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentHolder extends RecyclerView.ViewHolder {
    private ImageView ivstudentim;
    private TextView tvname;
    private TextView tvage;
    private TextView tvdob;
    private TextView tvaddress;
    private RelativeLayout relative;
    private clicklistener clicklistener;


    public StudentHolder(@NonNull View itemView, clicklistener clicklistener) {
        super(itemView);
        this.clicklistener= clicklistener;
        init(itemView);
    }

    private void init(View itemView){
        ivstudentim=itemView.findViewById(R.id.ivStudentImg);
        tvname=itemView.findViewById(R.id.tvName);
        tvaddress=itemView.findViewById(R.id.tvAddress);
        tvage=itemView.findViewById(R.id.tvAge);
        tvdob=itemView.findViewById(R.id.tvDob);
        relative=itemView.findViewById(R.id.relative);
       
    }
    public void setdata(Studentmodel studentmodel){
        ivstudentim.setImageResource(studentmodel.getImageid());
        tvname.setText(studentmodel.getName());
        tvdob.setText(studentmodel.getdob());
        tvaddress.setText(studentmodel.getAddress());
        tvage.setText(studentmodel.getAge()+"");
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             clicklistener.onitemclicked(studentmodel,getAdapterPosition());
            }
        });

    }
}
