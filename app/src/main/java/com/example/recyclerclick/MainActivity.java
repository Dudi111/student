package com.example.recyclerclick;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements clicklistener {
    private RecyclerView recycler;
    private ArrayList<Studentmodel> studentlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initi();
        buildlist();
        recyclerview();

    }

    private void initi() {

        recycler = findViewById(R.id.Recycler);
    }

    private void buildlist() {
        for (int i = 0; i < 50; i++) {
            Studentmodel studentmodel = new Studentmodel("prav" + i, "kulchander wardno7",
                    "15/04/1997", 25, R.drawable.prateek_sukla1);
            studentlist.add(studentmodel);
        }
    }

    private void recyclerview() {
        StudentAdapter studentadap = new StudentAdapter(studentlist,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(studentadap);

    }

    @Override
    public void onitemclicked(Studentmodel model, int position) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        model.getName() + "\n"
                                + model.getAge() + "\n"
                                + model.getdob() + "\n"
                                + model.getAddress()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();
    }
}


