package com.easychat.service;


import com.easychat.bean.AppVersion;

/**
 * Description: 版本检测
 */
public interface VersionService {

    /**
     * 检验版本
     * @param versionCode 当前版本码
     * @param appType App类型： 可选，默认为0 
     *           0.	智慧停车个人端
     *           1.	智慧停车巡检端
     * @return
     */
    AppVersion queryNewVersion(Integer versionCode, Integer appType);
}
