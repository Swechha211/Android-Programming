package com.example.recycleviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerConatctAdapter extends RecyclerView.Adapter<RecyclerConatctAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContact;
    RecyclerConatctAdapter(Context context, ArrayList<ContactModel> arrContact){
        this.context = context;
        this.arrContact = arrContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.conatct_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgcontact.setImageResource(arrContact.get(position).img);
        holder.txtName.setText(arrContact.get(position).name);
        holder.txtNumber.setText(arrContact.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgcontact;
        TextView txtName, txtNumber;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            imgcontact = itemView.findViewById(R.id.imgcontact);
            txtName =  itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
        }
    }

}
