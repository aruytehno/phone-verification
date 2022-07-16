package com.skillbox;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Jsup {
    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("http://www.beeline.ru/").get();
            Element mBody = doc.body();
            String name = doc.title();
            System.out.println("Name of page html: " + name);
            System.out.println(doc.body());

            Elements urls = mBody.getElementsByTag("a");
            for(Element url : urls)
            {
                //... и вытаскиваем их название...
                System.out.println("\nhref Mayak <a> "+url.attr("href"));

            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
