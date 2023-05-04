<%-- index.jsp --%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="nu.xom.Builder" %>
<%@ page import="nu.xom.Document" %>
<%@ page import="nu.xom.Elements" %>
<%@ page import="nu.xom.ParsingException" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RSS jarioak</title>
    </head>
    <body>
        <img src="img/logo.png" alt="El Correo">
        <%

        Builder builder;
        Document xml;
        Elements albisteak;
        try{
            builder = new Builder();
            xml = builder.build("https://www.elperiodicodearagon.com/rss");
            if(xml != null)
            {
                albisteak = xml.getRootElement().getFirstChildElement("channel").getChildElements("item");
                if(albisteak.size() > 0)
                {
                    out.println("<ul>");
                    for (int i = 0; i < albisteak.size(); i++)
                    {
                        out.println("<li><a href=\"" + albisteak.get(i).getFirstChildElement("link").getValue()
                             + "\" target=\"blank\">" + albisteak.get(i).getFirstChildElement("title").getValue() + "</a></li>");
                    }
                    out.println("</ul>");
                }
            }
        }catch(ParsingException e){
            //System.out.printf("Salbuespena: %s\n",e);
        }
        %>
    </body>
</html>