package com.cjj.demo.web;

import com.cjj.demo.NotFoundException;
import com.cjj.demo.service.BlogService;
import com.cjj.demo.service.TagService;
import com.cjj.demo.service.TypeService;
import com.cjj.demo.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private TagService tagService;

    @RequestMapping("/")
    public String index(@PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        BlogQuery blog, Model model) {
        model.addAttribute("page", blogService.listBlog(pageable));
        model.addAttribute("types", typeService.listTypeTop(6));
        model.addAttribute("tags", tagService.listTagTop(10));
        model.addAttribute("recommendBlogs", blogService.listRecommendBlogTop(8));
        return "index";
    }

    @RequestMapping("/blog/{id}")
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
