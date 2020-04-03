package com.titoubani.produit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.titoubani.produit.Model.Produit;

import java.util.List;



/**
 */

public class CustomAdapter extends ArrayAdapter<Produit> {
    Context context;
    int layoutResourceId;
    List<Produit> listproduit=null;


    public CustomAdapter( Context context, int resource,  List<Produit> objects) {
        super(context, resource, objects);
        this.layoutResourceId=resource;
        this.context=context;
        this.listproduit=objects;

    }


    static class DataHolder{
        TextView titlep;
        TextView prixu;
        TextView prixmoy;
        TextView prixmax;

    }



    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        DataHolder holder=null;
        if (convertView==null)
        {
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            convertView=inflater.inflate(layoutResourceId,parent,false);
            holder =new DataHolder();
            holder.titlep=(TextView)convertView.findViewById(R.id.title);
            holder.prixu=(TextView)convertView.findViewById(R.id.prixu);
            holder.prixmoy=(TextView)convertView.findViewById(R.id.prixmoy);
            holder.prixmax=(TextView)convertView.findViewById(R.id.prixmax);
            convertView.setTag(holder);
        }
        else {
            holder=(DataHolder)convertView.getTag();
        }
        Produit produit=listproduit.get(position);
        holder.titlep.setText(produit.getTitle());
        holder.prixu.setText(produit.getPrixu());
        holder.prixmoy.setText(produit.getPrixmoy());
        holder.prixmax.setText(produit.getPrixmax());

        return convertView;

    }

}
