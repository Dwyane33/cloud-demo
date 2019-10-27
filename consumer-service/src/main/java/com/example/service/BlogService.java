package com.example.service;

import com.example.bean.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 访问Blog的feign客户端服务
 */
@FeignClient(name = "producer-service")     //name属性 必须为服务的名称 也就是spring.application.name的值
public interface BlogService {

    //feign支持springmvc的@RequestMapping注解来表示你要访问服务的地址
    @RequestMapping("/blog/{title}")
    Blog findByTitle(@PathVariable("title") String title);

    @RequestMapping("/blog/findList")
    List<Blog> findList();
}
