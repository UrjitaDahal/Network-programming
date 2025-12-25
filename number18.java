
package com.mycompany.networklab2;
import java.net.*;
import java.util.List;
public class number18 {
    public static void main(String[] args) throws Exception {
        CookieManager manager = new CookieManager();
        CookieHandler.setDefault(manager);
        
        URL url = new URL("https://www.google.com");
        url.openConnection().getContent();

        CookieStore store = manager.getCookieStore();
        List<HttpCookie> cookies = store.getCookies();
        for (HttpCookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName() + ", Value: " + cookie.getValue());
        }
    }
}
