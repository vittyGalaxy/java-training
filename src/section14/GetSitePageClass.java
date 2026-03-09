package section14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetSitePageClass extends Thread {
    private String url;
    private String content;

    public GetSitePageClass(String url) {
        super();
        this.url = url;
    }

    @Override
    public void run() {
        try {
            URL site = new URL(this.url);
            URLConnection c = site.openConnection();

            InputStream in = c.getInputStream();
            String encoding = c.getContentEncoding();
            System.out.println("*********************************************");
            System.out.println("web page content: " + this.url);
            System.out.println(getString(in));
            System.out.println("*********************************************");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getString(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
