package com.example.gymtoday1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EspaldaAdapter extends RecyclerView.Adapter<EspaldaAdapter.EspaldaViewHolder>{
    private ArrayList<Espalda> data;

    public EspaldaAdapter(ArrayList<Espalda> data) {
        this.data = data;
    }

    @Override
    public EspaldaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EspaldaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.espalda_activity, parent, false));
    }

    @Override
    public void onBindViewHolder(EspaldaViewHolder holder, int position) {
        Espalda espalda = data.get(position);
        holder.imgFav.setImageResource(espalda.getImgFav());
        holder.imgEjercicio.setImageResource(espalda.getImgEjercicio());
        holder.nombre.setText(espalda.getNombre());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class EspaldaViewHolder extends RecyclerView.ViewHolder{

        ImageView imgFav;
        ImageView imgEjercicio;
        TextView nombre;

        public EspaldaViewHolder(View itemView) {
            super(itemView);
            imgFav = (ImageView) itemView.findViewById(R.id.imgfav);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            imgEjercicio = (ImageView) itemView.findViewById(R.id.imgejercicio);
        }
    }
}
