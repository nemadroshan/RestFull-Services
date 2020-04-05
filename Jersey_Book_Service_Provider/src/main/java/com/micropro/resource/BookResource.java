package com.micropro.resource;
import com.micropo.jsonUtil.JsonUtils;
import com.micropo.model.Book;
import com.micropo.responseDto.ResponseDTO;
import com.micropro.factory.DaoFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("book")
public class BookResource {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/registerPath")
    public ResponseDTO registerBook(String jsonBook) throws Exception {
        System.out.println("JsonBook : "+jsonBook);
        ResponseDTO responseDTO = new ResponseDTO();
        Book book =null;
        responseDTO.setMessage("Server Problem , Json data could not be received");
        if(jsonBook !=null){
            book = JsonUtils.convertJsonToJava(jsonBook,Book.class);
            int count = DaoFactory.getDao().registerBook(book);
            System.out.println( "Count : "+count);
            if(count>0){
                responseDTO.setMessage("Book Savaed SuccessFully");
                responseDTO.setData(book.toString());
                responseDTO.setStatus((byte) 1);
            }
            else {
                responseDTO.setMessage("Book Can not be saved");
            }
            System.out.println("Server Response : " +responseDTO.getMessage());
        }
        return responseDTO;
    }
}
