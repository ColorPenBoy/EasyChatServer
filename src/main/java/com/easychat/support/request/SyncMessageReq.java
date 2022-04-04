package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;

public class SyncMessageReq extends Packet {
    @Override
    public byte getCommand() {
        return Command.SYNC_MESSAGE_REQ;
    }
}
