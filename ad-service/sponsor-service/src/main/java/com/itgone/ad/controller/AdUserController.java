package com.itgone.ad.controller;

import com.alibaba.fastjson.JSON;
import com.itgone.ad.annotation.IgnoreResponseAdvice;
import com.itgone.ad.dao.AdUserRepository;
import com.itgone.ad.entity.AdUser;
import com.itgone.ad.exception.AdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Author: earlman
 * @Description:
 * @Date:Create：in 2019-10-15 22:08
 */
@RestController
@RequestMapping("/user")
public class AdUserController {

    @Autowired
    private AdUserRepository adUserRepository;

    @GetMapping("/list/{type}")
    @IgnoreResponseAdvice
    public List<AdUser> listUser(@PathVariable String type) {
        List<AdUser> userList = adUserRepository.findAll();

        if ("1".equals(type)) {
            throw new NullPointerException();
        }

        if ("2".equals(type)) {
            throw new AdException("");
        }

        return userList;
    }

    @PostMapping("/add")
    @IgnoreResponseAdvice
    public AdUser addUser(@RequestBody  AdUser user) {
//        AdUser adUser = new AdUser(user.getUsername(), user.getToken());
        AdUser save = adUserRepository.save(user);
        return save;
    }

}
