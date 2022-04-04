package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class AcceptResp extends Packet {
    /** 邀请方*/
    private String inviterId;
    /** 被邀请方*/
    private String invitedId;
    private String invitedName;
    /** 是否同意*/
    private boolean success;
    @Override
    public byte getCommand() {
        return Command.ACCEPT_RESP;
    }
}
