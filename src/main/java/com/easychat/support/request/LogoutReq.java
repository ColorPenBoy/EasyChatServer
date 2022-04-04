package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class LogoutReq extends Packet {
    @Override
    public byte getCommand() {
        return Command.LOGOUT_REQ;
    }
}
