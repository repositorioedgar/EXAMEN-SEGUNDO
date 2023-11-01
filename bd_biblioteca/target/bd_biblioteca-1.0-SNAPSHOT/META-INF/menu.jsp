<% 
   String opcion = request.getParameter("opcion");
%>

<ul class="nav flex-column">
  <li class="nav-item">
      <a class="nav-link <%= (opcion.equals("Libros") ? "active" : "")%>" href="libros.jsp"><u>Libros</u></a>
  </li>
  <li class="nav-item">
      <a class="nav-link <%= (opcion.equals("Categorias") ? "active" : "")%>" href="categorias.jsp"><br><u>Categorias</u></a>
  </li>
 </ul>
