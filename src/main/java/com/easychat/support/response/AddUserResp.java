package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class AddUserResp extends Packet {
    /** 邀请方id*/
    private String inviterId;
    private String inviterName;
    @Override
    public byte getCommand() {
        return Command.ADD_USER_RESP;
    }
}
