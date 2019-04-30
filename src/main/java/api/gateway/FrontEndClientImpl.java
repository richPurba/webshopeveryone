package api.gateway;

public class FrontEndClientImpl implements FrontEndClient {

    @Override
    public String getFrontEndPath(){
        return "http:/localhost:5000/content";

    }
}
