<%--
  Created by IntelliJ IDEA.
  User: Jordy Van Esbroeck
  Date: 25/10/2020
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="Stylesheet.css">
    <title>addItemShopIt</title>
</head>
<body>
<header>
    <h1>Shop-It</h1>
    <nav>
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><p>Add</p></li>
            <li><a href="Servlet">Overview</a></li>
        </ul>
    </nav>
</header>
<main>
    <section class="titel">
        <h1 >Add Items</h1>
    </section>
    <section class="intro">
        <p >Welkom, voeg onderaan je items toe</p>
    </section>
    <section class="form">
        <form  class = "input" method="POST" action="Servlet">
            <label for="Item">Item :</label><input type="text" name="Item" id="Item" required><br>
            <label for="Prijs">Prijs :</label><input type="text" name="Prijs" id="Prijs" required> <br>
            <label for="Hoeveelheid">Hoeveelheid :</label><input type="text" name="Hoeveelheid"id="Hoeveelheid" required><br>
            <input type="submit" value="Submit">
        </form>
    </section>
</main>
</body>
</html>
