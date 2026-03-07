package section14;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetSitePage extends Thread {
    private String url;
    private String content;

    public GetSitePage(String url){
        super();
        setURL(url);
    }

    @Override
    public void run(){
        try{
            URL url = new URL(this.url);

            URLConnection con = url.openConnection();
            InputStream is = con.getInputStream();

            setContent(Utils.getString(is));
        
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    // getter
    public String getURL(){
        return this.url;
    }

    public String getContent(){
        return this.content;
    }

    // setter
    public void setURL(String url){
        this.url = url;
    }

    public void setContent(String content){
        this.content = content;
    }
}
