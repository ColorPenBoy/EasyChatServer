package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class ApplyGroupReq extends Packet {
    /** 群Id **/
    private String groupId;

    @Override
    public byte getCommand() {
        return Command.APPLY_GROUP_REQ;
    }
}
