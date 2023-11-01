<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Categorias</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
      <div class="container">
    <h1>Categorias</h1>
    
    <jsp:include page="META-INF/menu.jsp">
        <jsp:param name="opcion" value="categorias"/>
    </jsp:include>

    <a href="#" class="btn"><br><u>Nuevo</u></a>
    <table class="table table-hover">
        <tr>
            <th>Id</th>
            <th>Categoria</th>
            <th> </th>
            <th> </th>
        </tr>
        
        <tr>
            <th>1</th>
            <th>Novela</th>
            <th> <a href="#">Editar</a></th>
            <th><a href="#">Eliminar</a></th>
        </tr>
    </table>
    
      </div>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html> 
