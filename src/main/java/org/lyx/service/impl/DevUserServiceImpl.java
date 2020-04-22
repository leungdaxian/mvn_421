package org.lyx.service.impl;

import org.lyx.dao.DevUserDao;
import org.lyx.pojo.DevUser;
import org.lyx.service.DevUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class DevUserServiceImpl implements DevUserService {

    @Resource
    private DevUserDao devUserDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public DevUser login(DevUser devUser) {
        return devUserDao.login(devUser);
    }
}
