<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
   <%-- <form action="Web" method="post">
        <table style="with:40%">
            <select name="student" id="Web">
                &lt;%&ndash; <option value="submit">add</option>
                 <option value="delete">delete</option>&ndash;%&gt;
                <option value="AddData">Add</option>

                <option value="DisplayData">Display</option>
                <option value="update">update</option>
            </select>

            <input type="submit"value="save" />
        </table>
    </form>--%>
  <c:redirect url="Display?action=display"></c:redirect>
</body>
</html>
