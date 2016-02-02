<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<h2>Hello World!</h2>
I am feeling: ${ mood.feeling }
<p> 
Click <a href="explanation/${mood.feeling}">here</a> to find explanation.