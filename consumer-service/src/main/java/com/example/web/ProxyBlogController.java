package com.example.web;
import com.example.bean.Blog;
import com.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProxyBlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/proxy/blog/{title}")
    public Blog findByTitle(@PathVariable("title") String title){
        return blogService.findByTitle(title);
    }

    @RequestMapping("/proxy/blog/findList")
    public List<Blog> findList(){
        return blogService.findList();
    }
}
