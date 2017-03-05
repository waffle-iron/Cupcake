/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

/**
 *
 * @author vfgya_000
 */
public class Topping
{
    private int toppingId;
    private String toppingType;
    private int toppingPrice;
    
    public Topping(int id, String type, int price)
    {
        toppingId = id;
        toppingType = type;
        toppingPrice = price;
    }

    public int getToppingId()
    {
        return toppingId;
    }

    public void setToppingId(int toppingId)
    {
        this.toppingId = toppingId;
    }

    public String getToppingType()
    {
        return toppingType;
    }

    public void setToppingType(String toppingType)
    {
        this.toppingType = toppingType;
    }

    public int getToppingPrice()
    {
        return toppingPrice;
    }

    public void setToppingPrice(int toppingPrice)
    {
        this.toppingPrice = toppingPrice;
    }
    
}
