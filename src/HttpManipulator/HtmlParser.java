package HttpManipulator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HtmlParser {

    private static String getHTML(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = br.read(buf);
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }

        return sb.toString();
    }

    private static void extractURLs(String html, List<String> list) {
        int pos = 0;
        char c;
        StringBuilder sb = new StringBuilder();

        do {
            pos = html.indexOf("<a href=\"", pos);
            if (pos >= 0) {
                pos += "<a href=\"".length();

                do {
                    c = html.charAt(pos++);
                    if (c != '"')
                        sb.append(c);
                } while (c != '"');

                list.add(sb.toString());
                sb.setLength(0);
            }
        } while (pos >= 0);
    }

    public static void main(String args[]) throws Exception {
        final String html = getHTML("http://prog.kiev.ua");

        final List<String> list = new ArrayList<String>();
        extractURLs(html, list);

        for (String s : list)
            System.out.println(s);
    }
}
