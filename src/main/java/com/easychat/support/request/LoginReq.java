package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class LoginReq extends Packet {
    /** 账号*/
    private String userName;
    /** 密码*/
    private String password;
    
    /** 是否登录后直接发送缓存消息*/
    private boolean sendCacheMessage = true;
    
    private String token;
    @Override
    public byte getCommand() {
        return Command.LOGIN_RRQ;
    }
}
