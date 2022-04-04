package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class AcceptGroupResp extends Packet {
    private String acceptUser;
    /** 添加群邀请方*/
    private String groupId;
    /** 是否同意*/
    private boolean success;
    @Override
    public byte getCommand() {
        return Command.ACCEPT_GROUP_RESP;
    }
}
