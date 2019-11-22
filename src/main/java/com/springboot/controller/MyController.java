package com.springboot.controller;

import com.springboot.domain.Music;
import com.springboot.service.impl.GetMusicTitleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author eternalSy
 * @version 1.0.0
 */

@Controller
public class MyController {

    @Autowired
    GetMusicTitleServiceImpl getMusicTitleServiceImpl;
    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("kuGouSoaring")
    public String kuGouSoaring(Model model){
        List<Music> music = getMusicTitleServiceImpl.getMusic("https://www.kugou.com/yy/html/rank.html");
        model.addAttribute("music",music);
        return "result";
    }

    @GetMapping("kuGouTop")
    public String kuGouTop(Model model){
        List<Music> music = getMusicTitleServiceImpl.getMusic("https://www.kugou.com/yy/rank/home/1-8888.html?from=rank");
        model.addAttribute("music",music);
        return "result";
    }

    @GetMapping("networkHot")
    public String networkHot(Model model){
        List<Music> music = getMusicTitleServiceImpl.getMusic("https://www.kugou.com/yy/rank/home/1-23784.html?from=rank");
        model.addAttribute("music",music);
        return "result";
    }

    @GetMapping("djHot")
    public String djHot(Model model){
        List<Music> music = getMusicTitleServiceImpl.getMusic("https://www.kugou.com/yy/rank/home/1-24971.html?from=rank");
        model.addAttribute("music",music);
        return "result";
    }

    @GetMapping("kuGouRadar")
    public String kuGouRadar(Model model){
        List<Music> music = getMusicTitleServiceImpl.getMusic("https://www.kugou.com/yy/rank/home/1-37361.html?from=rank");
        model.addAttribute("music",music);
        return "result";
    }
}
