package com.cjj.demo.web;

import com.cjj.demo.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("博客不存在");
//        }
        return "index";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/types")
    public String types() {
        return "types";
    }

    @RequestMapping("/tags")
    public String tags() {
        return "tags";
    }

    @RequestMapping("/archives")
    public String archives() {
        return "archives";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
