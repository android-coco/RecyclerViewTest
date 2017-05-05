package org.yh.recyclerviewtest;

/**
 * Created by yhlyl on 2017/4/12.
 */

public class Fruit
{
    private String name;

    private int imageId;

    public Fruit(String name, int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageId()
    {
        return imageId;
    }
}
