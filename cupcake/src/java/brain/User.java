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
public class User
{
    private int uid;
    private String uname;
    private String upword;
    private double balance;
    
    public User(int id, String name, String pword, double bl)
    {
        uid = id;
        uname = name;
        upword = pword;
        balance = bl;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    

    public int getUid()
    {
        return uid;
    }

    public void setUid(int uid)
    {
        this.uid = uid;
    }

    public String getUname()
    {
        return uname;
    }

    public void setUname(String uname)
    {
        this.uname = uname;
    }

    public String getUpword()
    {
        return upword;
    }

    public void setUpword(String upword)
    {
        this.upword = upword;
    }
    
    
}
