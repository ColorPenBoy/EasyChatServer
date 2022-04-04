package com.easychat.serializer;

public interface Serializer {
    Serializer Default = new JsonSerializer();
    byte getSerializerAlgorithm();
    
    <T> byte [] serializer(T t);
    
    <T> T deSerializer(Class<T> clazz, byte[] bytes);
}
