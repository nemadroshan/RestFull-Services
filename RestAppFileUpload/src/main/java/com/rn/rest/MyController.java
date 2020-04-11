package com.rn.rest;



import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
@Path("/file")
public class MyController {
    private static final String FOLDER_PATH = "D:\\MyData\\Files";

    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String uploadFile(@FormDataParam("file") InputStream fis,@FormDataParam("file") FormDataContentDisposition fdcd) {
        OutputStream outpuStream = null;
        String fileName = fdcd.getFileName();
        String filePath = FOLDER_PATH + fileName;
        try {
            int read = 0;  byte[] bytes = new byte[1024];
            outpuStream = new FileOutputStream(new File(filePath));
            while ((read = fis.read(bytes)) != -1) {
                outpuStream.write(bytes, 0, read);
            }
            outpuStream.flush(); outpuStream.close();
        } catch (IOException iox) {
            iox.printStackTrace();
        } finally {
            if (outpuStream != null) {
                try { outpuStream.close();
                } catch (Exception ex) {
                }
            }
        }
        return "File Uploaded Successfully !!";
    }

}
