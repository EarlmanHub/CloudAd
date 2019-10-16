package com.itgone.ad.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.MessageFormat;

/**
 * @Author: earlman
 * @Description:
 * @Date:Create：in 2019-10-16 22:22
 */
@FeignClient("SponsorService")
@RequestMapping("/SponsorService")
public interface SponsorClient {

    String path = "/user";

    @GetMapping(path + "/list/{type}")
    Object getUserList(@PathVariable String type);

}
