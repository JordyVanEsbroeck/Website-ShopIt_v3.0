<%@ page import="domain.ShopList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Jordy Van Esbroeck
  Date: 25/10/2020
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="Stylesheet.css">
    <title>overviewShopIt</title>
</head>
<body>
<header>
    <h1>Shop-It</h1>
    <nav>
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="addItem.jsp">Add</a></li>
            <li><p>Overview</p></li>
        </ul>
    </nav>
</header>
<main>
    <section class="titel"><h1 >Shoppinglist</h1></section>
    <section class="intro"><p >Hier zie je een overview van je shoppinglijst</p></section>
    <section class="form"><% List<ShopList> lijst= (List<ShopList>) request.getAttribute("lijst");
    if (lijst != null){%>
        <table>
            <tr id="table_head">
                <th>Item</th>
                <th>Prijs</th>
                <th>Hoeveelheid</th>
            </tr>
            <% for (ShopList shopList:lijst){%>
            <tr>
                <td><%=shopList.getNaam()%></td>
                <td><%=shopList.getPrijs()%></td>
                <td><%=shopList.getHoeveelheid()%></td>

            </tr>
            <%}%>
        </table>
        <%}%>
    </section>
    <section>
        <p>
            <% double gemiddeldePrijs = (double)request.getAttribute("gemiddeldePrijs");%>
            De gemiddelde prijs is <%=gemiddeldePrijs%>.
        </p>
    </section>

</main>

</body>
</html>
