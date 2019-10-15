package com.itgone.ad.dao;

import com.itgone.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: earlman
 * @Description:
 * @Date:Create：in 2019-10-15 22:06
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {
}
