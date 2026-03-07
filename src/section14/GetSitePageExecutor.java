package section14;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class GetSitePageExecutor implements Callable<String>{
    private String url;

    public GetSitePageExecutor(String url){
        super();
        setURL(url);
    }

     @Override
     public String call() throws Exception{
        try{
            URL url = new URL(this.url);

            URLConnection con = url.openConnection();
            InputStream is = con.getInputStream();

            return Utils.getString(is);
        
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
     }

    // getter
    public String getURL(){
        return this.url;
    }

    // setter
    public void setURL(String url){
        this.url = url;
    }
}
