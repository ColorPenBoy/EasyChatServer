package com.easychat.code;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * 基于长度域拆包器
 */
public class Spliter extends LengthFieldBasedFrameDecoder {
    /**
     * 魔数 4字节
     * 版本号 1字节
     * 序列化算法 1字节
     * 指令 1字节
     */
    private static final int LENGTH_FIELD_OFFSET = 7;

    /**
     * 数据长度 4字节
     */
    private static final int LENGTH_FIELD_LENGTH = 4;
    public Spliter() {
        super(Integer.MAX_VALUE, LENGTH_FIELD_OFFSET, LENGTH_FIELD_LENGTH);
    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
        if (in.getInt(in.readerIndex()) != PacketCode.MAGIC_NUMBER) {
            ctx.channel().close();
            return null;
        }
        return super.decode(ctx, in);
    }
}
