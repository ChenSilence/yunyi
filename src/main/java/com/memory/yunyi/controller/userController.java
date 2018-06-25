package com.memory.yunyi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class userController {
//    @GetMapping
//    public  String index(){
//        return "index";
//    }

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("userList")
    public String userlistPage(){
        return "userList";
    }

    @GetMapping("modelList")
    public String modelPage(){
        return "modelList";
    }
    @GetMapping("likesCount")
    public String likesPage(){
        return "likesCount";
    }

    @GetMapping("complainCount")
    public String reportPage(){
        return "complainCount";
    }

    @GetMapping("log")
    public String logPage(){
        return "log";
    }
    @GetMapping("modelAdd")
    public String modelAddPage(){
        return "modelAdd";
    }
}
