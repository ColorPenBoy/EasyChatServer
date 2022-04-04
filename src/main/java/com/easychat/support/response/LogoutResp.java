package com.easychat.support.response;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class LogoutResp extends Packet {
    @Override
    public byte getCommand() {
        return Command.LOGOUT_RESP;
    }
}
