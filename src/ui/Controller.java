package ui;

import domain.ShopListDB;
import domain.ShopList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet")
public class Controller extends HttpServlet {
    private ShopListDB shopListDB = new ShopListDB();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("Naam");
        String prijs = request.getParameter("Prijs");
        String hoeveelheid = request.getParameter("Hoeveelheid");

        try {
            double intprijs = Double.parseDouble(prijs);
            int intHoeveelheid = Integer.parseInt(hoeveelheid);
            shopListDB.NextItem(new ShopList(naam,intprijs,intHoeveelheid));
        }
        catch(Exception e) {
            RequestDispatcher view = request.getRequestDispatcher("additem.jsp");
            view.forward(request,response);
        }
        request.setAttribute("gemiddeldePrijs",shopListDB.gemiddeldePrijs());
        request.setAttribute("lijst",shopListDB.getLijst());
        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");

        view.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("gemiddeldePrijs",shopListDB.gemiddeldePrijs());
        request.setAttribute("lijst",shopListDB.getLijst());

        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");

        view.forward(request,response);


    }
}
