package com.perisic.basicweb;

import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.io.InputStream;
/**
 * Very basic example for browsing the Internet with Java. 
 * @author vim
 *
 */

public class ReadWebSite {

    public ReadWebSite() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {

        System.out.println("=== Start reading web site ===");

        URL url;
        try {
   
            url = new URL("https://www.perisic.com/marc-conrad/");
            InputStream inputStream = url.openStream();

                   
            // Choose anyone of https://stackoverflow.com/questions/309424/how-do-i-read-convert-an-inputstream-into-a-string-in-java
            // to convert InputStream to String.
            ByteArrayOutputStream result = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                result.write(buffer, 0, length);
            }
            // StandardCharsets.UTF_8.name() > JDK 7
            System.out.println(result.toString("UTF-8"));
        } catch (Exception e) {
            System.out.println("An Error occured: "+e.toString());
            e.printStackTrace();
        }

        System.out.println("=== End of Web Site === ");
    }

}