package com.cjj.demo.dao;

import com.cjj.demo.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);
}
