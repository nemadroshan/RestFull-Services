package com.nt.client;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

public class GreetResourceClient {
    private static final String RES_URL ="http://localhost:8060/RestEasyApp2_BootStraping_war/api/greet/msg";
    public static void main(String[] args) throws Exception {
        ClientRequest request =new ClientRequest(RES_URL);
        ClientResponse<String> response = request.get(String.class);
        System.out.println("-----------Request Response--------------");
        String res = response.getEntity();
        System.out.println("res :: "+res);
    }
}
