/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4a2;

/**
 *
 * @author cui
 */
public class Rectangle {
    private int length, width;
    public Rectangle(){
    length = 5; width = 2;
    }
    public Rectangle(int l, int w){
        length = l; width = w;
    }
    public void setLength(int l) //sets the value of length
    {
        length = l;
    }
    public void setWidth(int w) //sets the value of width
    {
        width = w;
    }
    public int getLength() //gets the value of length
    {
        return length;
    }
    public int getWidth() //gets the value of width
    {
    return width;
    }
    public int area ()
    {
    return (length*width);
    
    }
