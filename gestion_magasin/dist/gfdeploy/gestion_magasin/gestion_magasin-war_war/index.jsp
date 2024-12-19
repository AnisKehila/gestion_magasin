<%@page import="entities.gcategory.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Category List</h1>
        
        <!-- Use JSP's useBean to instantiate CategoryBean -->
        <jsp:useBean id="categoryFacade" class="entities.gcategory.CategoryFacade" scope="request" />
        
        <% 
            Category c = new Category();
            c.setName("name");
            categoryFacade.create(c);
        %>
    </body>
</html>
