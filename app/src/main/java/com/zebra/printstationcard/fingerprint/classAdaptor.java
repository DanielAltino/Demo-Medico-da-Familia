package com.zebra.printstationcard.fingerprint;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class classAdaptor extends BaseAdapter {

    private Context ctx;
    private String[] lista;

    public classAdaptor(Context context, String[] lista){
        this.ctx = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.length;
    }

    @Override
    public Object getItem(int i) {
        return lista[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View conveertView, ViewGroup parent) {

        TextView tv = new TextView(ctx);
        tv.setText(lista[position]);
        tv.setTextColor(Color.RED);


        return null;
    }
}
