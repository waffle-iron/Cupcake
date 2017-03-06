/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import brain.Bottom;
import brain.Cupcake;
import brain.DAO;
import brain.Topping;
import brain.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vfgya_000
 */
@WebServlet(name = "CCservlet2", urlPatterns
        = {
            "/CCservlet2"
        })
public class CCservlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (!(request.getSession().getAttribute("user") == null)) {
            try {
                DAO dao = new DAO();

                User usses = (User) request.getSession().getAttribute("user");

                ArrayList<Bottom> btList = dao.getBottoms();
                request.setAttribute("bottomList", btList);

                ArrayList<Topping> tpList = dao.getToppings();
                request.setAttribute("toppingList", tpList);

                ArrayList<Cupcake> ccs = (ArrayList<Cupcake>) request.getSession().getAttribute("ccList");

                if (ccs == null) {
                    ccs = new ArrayList<Cupcake>();
                    request.getSession().setAttribute("ccList", ccs);
                }

                String urladd = request.getParameter("bottom");

                if (urladd != null) {

                    String bottomType;
                    String toppingType;
                    int bothPrices;
                    String totalPriceString = request.getParameter("total");
                    int totalPriceInt = Integer.parseInt(totalPriceString);
                    String btType = request.getParameter("bottom");
                    String tpType = request.getParameter("topping");

                    Cupcake cupcake = null;

                    cupcake = new Cupcake(bottomType = btType, toppingType = tpType, bothPrices = totalPriceInt);
                    ccs.add(cupcake);

                    request.getSession().setAttribute("ccList", ccs);

                }
                if (request.getParameter("Checkout") != null) {
                    for (int i = 0; i < ccs.size(); i++) {
                        dao.insertOrder(usses.getUid(), ccs.get(i).getbType(), ccs.get(i).gettType(), ccs.get(i).getBothPrice());
                    }
                    ccs.clear();
                    RequestDispatcher rd = request.getRequestDispatcher("/AfterCH.jsp");
                    rd.forward(request, response);
                }

                RequestDispatcher rd = request.getRequestDispatcher("/cupcakeList.jsp");
                rd.forward(request, response);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw e;
            }
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
