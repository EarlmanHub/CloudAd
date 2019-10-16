package com.itgone.ad.client.controller;

import com.itgone.ad.client.feign.SponsorClient;
import com.itgone.ad.client.vo.AdUserGetReq;
import com.itgone.ad.vo.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: earlman
 * @Description:
 * @Date:Create：in 2019-10-16 20:26
 */
@RestController
@RequestMapping("/search/user")
public class SearchController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/listByRibbon")
    public Object getUserListByRibbon() {
        ResponseEntity<List> forEntity = restTemplate.getForEntity("http://SponsorService/SponsorService/user/list/4", List.class);
        return forEntity.getBody();
    }

    @Autowired
    private SponsorClient sponsorClient;

    @RequestMapping("/list2")
    public CommonResponse<List<AdUserGetReq>> getUserListByFeign(){
        CommonResponse<List<AdUserGetReq>> result = sponsorClient.getUserList("4");
        return result;
    }

}