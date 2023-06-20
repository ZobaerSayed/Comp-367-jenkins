<!DOCTYPE html>
<html>
<head>
    <title>Greeting Web App</title>
</head>
<body>
    <h1>Welcome from COMP-367!</h1>
    
    <%-- Retrieve the user's name from the query parameter --%>
    <% String name = request.getParameter("name"); %>
    
    <%-- Check if the name is provided --%>
    <% if (name != null && !name.isEmpty()) { %>
        <h2>Hello, <%= name %>!</h2>
    <% } else { %>
        <p>Please provide your name as a query parameter. Example: ?name=Zobaer</p>
    <% } %>
</body>
</html>
