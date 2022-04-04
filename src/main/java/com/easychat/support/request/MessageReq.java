package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class MessageReq extends Packet {
    /** 消息接收方*/
    private String receiver;
    /** 消息内容*/
    private String message;
    /**
     * 消息类型
     */
    private int messageType = 0;
    @Override
    public byte getCommand() {
        return Command.SEND_MESSAGE_REQ;
    }
}
