package com.idn99.project.nekuku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class KarakterAdapter extends RecyclerView.Adapter<KarakterAdapter.RecyclerViewHolder>{
    private ArrayList<Karakter> karakters;
    private Context context;

    public KarakterAdapter(ArrayList<Karakter> karakters, Context context) {
        this.karakters = karakters;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.design_karakter, parent, false);
        return new RecyclerViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.img.setImageResource(karakters.get(position).getGambarKarakter());
        holder.tv1.setText(karakters.get(position).getNamaKarakter());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return (karakters != null) ? karakters.size() : 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView img;
        private TextView tv1;
        private int position;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_karakter);
            tv1 = itemView.findViewById(R.id.nama_karakter);
        }
    }
}
