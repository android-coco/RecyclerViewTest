package org.yh.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        //纵向布局
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        FruitAdapter adapter = new FruitAdapter(fruitList,R.layout.fruit_item);
//        recyclerView.setAdapter(adapter);

        //横向
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);//水平布局
//        recyclerView.setLayoutManager(layoutManager);
//        FruitAdapter adapter = new FruitAdapter(fruitList,R.layout.fruit_item1);
//        recyclerView.setAdapter(adapter);
        //网格
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        FruitAdapter adapter = new FruitAdapter(fruitList,R.layout.fruit_item1);
//        recyclerView.setAdapter(adapter);
        //瀑布流布局
        fruitList.clear();
        initFruits1();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,
                StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        XAdapter adapter = new XAdapter(fruitList, R.layout.fruit_item1);
        recyclerView.setAdapter(adapter);
    }


    private void initFruits()
    {
        for (int i = 0; i < 2; i++)
        {
            Fruit apple = new Fruit("Apple", R.mipmap.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.mipmap.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.mipmap.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.mipmap.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.mipmap.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.mipmap.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.mipmap.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.mipmap.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.mipmap.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.mipmap.mango_pic);
            fruitList.add(mango);
        }
    }

    private void initFruits1()
    {
        for (int i = 0; i < 2; i++)
        {
            Fruit apple = new Fruit(getRandomLengName("Apple"), R.mipmap.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengName("Banana"), R.mipmap.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengName("Orange"), R.mipmap.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengName("Watermelon"), R.mipmap.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengName("Pear"), R.mipmap.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengName("Grape"), R.mipmap.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengName("Pineapple"), R.mipmap.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengName("Strawberry"), R.mipmap.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengName("Cherry"), R.mipmap.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLengName("Mango"), R.mipmap.mango_pic);
            fruitList.add(mango);
        }
    }

    private String getRandomLengName(String name)
    {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            builder.append(name);
        }
        return builder.toString();
    }

}
