package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class AllowGroupResp extends Packet {
    /** 群id*/
    private String groupId;
    /** 是否同意*/
    private boolean allow;
    @Override
    public byte getCommand() {
        return Command.ALLOW_GROUP_RESP;
    }
}
