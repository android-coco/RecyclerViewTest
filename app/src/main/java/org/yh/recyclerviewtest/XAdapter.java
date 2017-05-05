package org.yh.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yhlyl on 2017/4/13.
 */

public class XAdapter extends RecyclerView.Adapter<XAdapter.ViewHolder>
{
    private List<Fruit> fruits;
    private int layoutId;
    public XAdapter(List<Fruit> list, int layoutId)
    {
        fruits = list;
        this.layoutId =layoutId;
    }
    static class ViewHolder extends RecyclerView.ViewHolder
    {
        View itemView;
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemView)
        {
            super(itemView);
            this.itemView = itemView;
            imageView = (ImageView) itemView.findViewById(R.id.fruit_image);
            textView = (TextView) itemView.findViewById(R.id.fruit_name);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Fruit fruit = fruits.get(position);
        holder.imageView.setImageResource(fruit.getImageId());
        holder.textView.setText(fruit.getName());
    }

    @Override
    public int getItemCount()
    {
        return fruits.size();
    }


}
