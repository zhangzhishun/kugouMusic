package com.springboot.service.impl;

import com.springboot.domain.Music;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eternalSy
 * @version 1.0.0
 */
@Service
public class GetMusicTitleServiceImpl {

    public List<Music> getMusic(String url){
        List<Music> result = new ArrayList<>();
        Document document = null;
        try{
            document = Jsoup.connect(url).get();
            Elements ElementsUl = document.getElementsByTag("ul");
            for (Element elementLi : ElementsUl) {
                Elements provinceEl = elementLi.getElementsByTag("li");
                for (Element qq : provinceEl) {
                    String title = qq.attr("title");
                    if(!title.equals("")){
                        String[] temp = title.split("-");
                        Music music = new Music();
                        music.setSongName(temp[1]);
                        music.setSinger(temp[0]);
                        result.add(music);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
