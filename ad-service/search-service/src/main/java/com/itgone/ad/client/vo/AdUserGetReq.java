package com.itgone.ad.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: earlman
 * @Description:
 * @Date:Create：in 2019-10-16 20:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUserGetReq {

    private Long id;

    private String username;

    private String token;

    private Integer userStatus;

    private Date createTime;

    private Date updateTime;
}
