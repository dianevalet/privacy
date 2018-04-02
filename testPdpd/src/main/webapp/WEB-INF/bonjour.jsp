<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
       <table>
      <th>Name</th>
      <th>Id</th>
      <c:forEach items="${persons}" var="current">
        <tr>
          <td><c:out value="${current.nom}" /><td>
          <td><c:out value="${current.prenom}" /><td>
        </tr>
      </c:forEach>
    </table>
    </body>
</html>
