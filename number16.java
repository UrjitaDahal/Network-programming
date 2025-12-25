
package com.mycompany.networklab2;
import java.net.*;
import java.io.*;
import java.util.*;

public class number16 extends ProxySelector {
    public List<Proxy> select(URI uri) {
        if (uri.getHost().contains("example.com")) {
            return Collections.singletonList(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 80)));
        }
        return Collections.singletonList(Proxy.NO_PROXY);
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        System.err.println("Connection to " + uri + " failed.");
    }

    public static void main(String[] args) {
        ProxySelector.setDefault(new number16());
        System.out.println("Proxy selector registered.");
    }
}
