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
public class Cupcake
{
    private String bType;
    private String tType;
    private int bothPrice;
    
    public Cupcake(String btyp, String ttyp, int price) {
        bType = btyp;
        tType = ttyp;
        bothPrice = price;
    }

    public String getbType()
    {
        return bType;
    }

    public void setbType(String bType)
    {
        this.bType = bType;
    }

    public String gettType()
    {
        return tType;
    }

    public void settType(String tType)
    {
        this.tType = tType;
    }

    public int getBothPrice()
    {
        return bothPrice;
    }

    public void setBothPrice(int bothPrice)
    {
        this.bothPrice = bothPrice;
    }
    
}
