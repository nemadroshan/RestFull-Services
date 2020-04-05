package com.micropro.client;
import com.micropo.jsonUtil.JsonUtils;
import com.micropo.model.Book;
import com.micropo.responseDto.ResponseDTO;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class BookServiceClient {
    public ResponseDTO saveBookDetail(Book book){
        String uri = "http://localhost:8090/Jersey_Book_Service_Provider_war/book/registerPath";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(uri);
        Builder builder = target.request(MediaType.APPLICATION_JSON);
        builder.accept(MediaType.APPLICATION_JSON);
        Response clientResponse = builder.post(Entity.entity(book, MediaType.APPLICATION_JSON), Response.class);
        String jsonResponse = clientResponse.readEntity(String.class);
        System.out.println("Jason Response "+jsonResponse);
        ResponseDTO dto = JsonUtils.convertJsonToJava(jsonResponse,ResponseDTO.class);
        return dto;
    }
}
