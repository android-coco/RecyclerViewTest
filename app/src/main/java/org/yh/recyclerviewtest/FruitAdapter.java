package org.yh.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


/**
 * Created by yhlyl on 2017/4/12.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>
{
    private List<Fruit> mFruitList;
    private int layoutId;
    //布局缓存 继承RecyclerView.ViewHolder
    static class ViewHolder extends RecyclerView.ViewHolder
    {
        View itemView;
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View itemView)
        {
            super(itemView);
            this.itemView = itemView;
            fruitImage = (ImageView) itemView.findViewById(R.id.fruit_image);
            fruitName = (TextView) itemView.findViewById(R.id.fruit_name);
        }
    }
    //数据源
    public FruitAdapter(List<Fruit> fruitList,int layoutId)
    {
        this.mFruitList = fruitList;
        this.layoutId = layoutId;
    }
    //创建ViewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(view.getContext(),"you clicked view     " + fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });

        holder.fruitImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(view.getContext(),"you clicked Image      " + fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });
        return holder;
    }
    //绑定数据到ViewHolder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }
    //item的个数 及数据条数
    @Override
    public int getItemCount()
    {
        return mFruitList.size();
    }


}
