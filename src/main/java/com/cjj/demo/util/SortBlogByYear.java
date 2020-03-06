package com.cjj.demo.util;

import com.cjj.demo.po.Blog;

import java.util.Comparator;

public class SortBlogByYear implements Comparator<Blog> {

    @Override
    public int compare(Blog o1, Blog o2) {
        return o2.getUpdateTime().compareTo(o1.getUpdateTime());
    }
}
