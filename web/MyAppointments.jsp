<%--
  Created by IntelliJ IDEA.
  User: xarat
  Date: 14/6/2021
  Time: 12:32 π.μ.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Previous Appointments</title>


    <style>
        body { font-family: Calibri;}
        table,th,td { border: 0px; padding: 0px;}
        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        /* Set a style for all buttons */
        .button {
            background-color: #05125c;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer
        }
        button:hover {
            opacity: 0.8;
        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: #111;
        }
    </style>
</head><body>
<jsp:include page="/servlets.ShowPreviousAppointmentsServlet"/>
<form action="index.jsp">
    <input type='submit' class = 'button' value='Logout'>
</form>
</body>
</html>