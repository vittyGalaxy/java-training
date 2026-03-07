package section14;

import java.util.concurrent.RecursiveTask;

public class GetSitePageForkJoin extends RecursiveTask<String> {
    private String url;

    public GetSitePageForkJoin(String url){
        setURL(url);
    }

    @Override
    protected String compute() {

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
