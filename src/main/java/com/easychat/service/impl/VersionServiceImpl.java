package com.easychat.service.impl;

import com.easychat.bean.AppVersion;
import com.easychat.mapper.AppVersionMapper;
import com.easychat.service.VersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 版本检测
 */
@Service
@Slf4j
public class VersionServiceImpl implements VersionService {
    
    @Autowired
    private AppVersionMapper appVersionMapper;
    
    @Override
    public AppVersion queryNewVersion(Integer versionCode, Integer appType) {
        AppVersion appVersion = appVersionMapper.queryNewVersion(versionCode, appType);
        Integer forcedUpgrade = appVersionMapper.isForcedUpgrade(versionCode, appType);
        if (forcedUpgrade != null && forcedUpgrade == 1) {
            appVersion.setForcedUpgrade(true);
        }
        
        return appVersion;
    }
}
