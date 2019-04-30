package api.gateway;

public class ContentClientImpl implements ContentClient{

        //TODO: this is not calling any http protocol. If it was, then what should i put cause i put @Resource in ApiGateway
    @Override
    public String getContentPath(){
        return "http:/localhost:9090/content";
    }
}
