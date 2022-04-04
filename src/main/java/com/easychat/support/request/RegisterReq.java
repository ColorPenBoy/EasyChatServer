package com.easychat.support.request;

import com.easychat.support.Command;
import com.easychat.support.Packet;
import lombok.Data;

@Data
public class RegisterReq extends Packet {
    /** 账号*/
    private String userName;
    /** 密码*/
    private String password;
    private String nickName;
    /** 是否登录*/
    private boolean login;
    
    @Override
    public byte getCommand() {
        return Command.REGISTER_REQ;
    }
}
