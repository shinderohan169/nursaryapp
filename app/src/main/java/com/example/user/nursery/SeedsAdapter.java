package com.example.user.nursery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SeedsAdapter extends RecyclerView.Adapter<SeedsAdapter.MyViewHolder> {
    @NonNull
    List<Model> my_list;
    Context context;

    public SeedsAdapter(@NonNull List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.seeds_list_items,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model=my_list.get(position);
        holder.name.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));

    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name,price;

        public MyViewHolder(View itemView) {
            super(itemView);
           image=itemView.findViewById(R.id.image);
           name=itemView.findViewById(R.id.name);
           price=itemView.findViewById(R.id.price);

        }
    }
}
