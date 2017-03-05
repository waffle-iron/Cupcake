/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;

import data.DBConnector;
import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vfgya_000
 */
public class DAO {

    private Connection con;

    public DAO() {
        con = new DBConnector().getConnection();
    }

    DBConnector db = new DBConnector();

    public User getUser(String name, String pword) {
        Statement stmt = null;
        String query = "select * from users where u_name = '" + name + "' and u_password = '" + pword + "'";
        User user = null;

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                user = new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return user;
    }

    public ArrayList<Bottom> getBottoms() {
        ArrayList<Bottom> bottoms = new ArrayList<Bottom>();

        Statement stmt = null;
        String query = "select * from cc_bottoms";
        Bottom bottom = null;

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int btid = rs.getInt("bt_id");
                String bttype = rs.getString("bt_type");
                int btprice = rs.getInt("bt_price");
                bottom = new Bottom(btid, bttype, btprice);
                bottoms.add(bottom);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return bottoms;

    }

    public ArrayList<Topping> getToppings() {
        ArrayList<Topping> toppings = new ArrayList<Topping>();

        Statement stmt = null;
        String query = "select * from cc_toppings";
        Topping topping = null;

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int tpid = rs.getInt("tp_id");
                String tptype = rs.getString("tp_type");
                int tpprice = rs.getInt("tp_price");
                topping = new Topping(tpid, tptype, tpprice);
                toppings.add(topping);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return toppings;

    }

    public Bottom getBottomByType(String type) {
        Statement stmt = null;
        String query = "select * from cc_bottoms where bt_type = " + type;
        Bottom bottom = null;

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                bottom = new Bottom(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return bottom;
    }

    public Topping getToppingByType(String type) {
        Statement stmt = null;
        String query = "select * from cc_toppings where tp_type = " + type;
        Topping topping = null;

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                topping = new Topping(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return topping;
    }
    public void insertOrder(int userid, String bottom, String topping, int price) {
        PreparedStatement insertRS = null;
        
        String stmtRS = "INSERT INTO orders (fkuserid, bttype, tptype, price) VALUES (?,?,?,?)";
        try {
        
        insertRS = con.prepareStatement(stmtRS);
        
        
        insertRS.setInt(1, userid);
        insertRS.setString(2, bottom);
        insertRS.setString(3, topping);
        insertRS.setInt(4, price);
        
        insertRS.executeUpdate();
        
        
        } catch (Exception e)
        {
            if(con != null) {
                try {
                    System.out.println(e.getMessage());
                    con.rollback();
                }
                catch (SQLException excep) {
                    
                }
            }
        }
    }

}
