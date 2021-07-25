package com.example.todolist;


public class Categories{
    private String name;
    private int color;
    private boolean show;


    public Categories(String n, int c)
    {
        this.name = n;
        this.color = c;
        show = true;
    }


    public String getName()
    {
        return (this.name);
    }


    public int getColor()
    {
        return (this.color);
    }


    public void setName(String n)
    {
        this.name = n;
    }


    public void setColor(int c)
    {
        this.color = c;
    }


    public boolean getShow() {
        return this.show;
    }

    public void setShow(boolean show1) {
        this.show = show1;
    }
}
