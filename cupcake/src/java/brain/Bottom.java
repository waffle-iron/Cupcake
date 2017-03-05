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
public class Bottom
{
    private int bottomId;
    private String bottomType;
    private int bottomPrice;
    
    public Bottom(int id, String type, int price)
    {
        bottomId = id;
        bottomType = type;
        bottomPrice = price;
    }

    public int getBottomId()
    {
        return bottomId;
    }

    public void setBottomId(int bottomId)
    {
        this.bottomId = bottomId;
    }

    public String getBottomType()
    {
        return bottomType;
    }

    public void setBottomType(String bottomType)
    {
        this.bottomType = bottomType;
    }

    public int getBottomPrice()
    {
        return bottomPrice;
    }

    public void setBottomPrice(int bottomPrice)
    {
        this.bottomPrice = bottomPrice;
    }
    
}
