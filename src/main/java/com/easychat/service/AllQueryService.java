package com.easychat.service;

import com.easychat.bean.QueryBean;

import java.util.List;

public interface AllQueryService {
    /**
     * 根据key查询群组 或者用户信息
     * @param key
     * @param curPage
     * @param pageSize
     * @return
     */
    List<QueryBean> queryAll(String key, int curPage, int pageSize);
}
