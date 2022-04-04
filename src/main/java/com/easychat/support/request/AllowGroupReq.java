package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class AllowGroupReq extends Packet {
    /** 群Id*/
    private String groupId;
    /** 申请入群的用户户id*/
    private String userId;
    /** 是否允许用户入群*/
    private boolean allow;
    @Override
    public byte getCommand() {
        return Command.ALLOW_GROUP_REQ;
    }
}
