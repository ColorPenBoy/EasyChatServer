package com.easychat.bean;

import lombok.Data;

@Data
public class GroupMember {
    /** 用户id*/
    private String userId;
    /** */
    private String userName;
    /** */
    private String nickName;
    /** 用户备注*/
    private String remark;
    /** 用户在群里的备注*/
    private String groupRemark;
}
