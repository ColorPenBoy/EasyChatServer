package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class ApplyGroupResp extends Packet {
    private String applyUserId;
    private String applyUserName;
    /** 添加群邀请方*/
    private String groupId;
    private String groupName;
    @Override
    public byte getCommand() {
        return Command.APPLY_GROUP_RESP;
    }
}
