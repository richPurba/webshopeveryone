package api.gateway;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
public class ApiGateway {

    @Resource
    private ContentClient contentClient;

    @Resource
    private FrontEndClient frontEndClient;

    @GET
    @Path("/frontend")
    public String getFrontEnd(){
        return contentClient.getContentPath();
    }

    @GET
    @Path("/content")
    public String getContent(){
        return frontEndClient.getFrontEndPath();
    }
}
