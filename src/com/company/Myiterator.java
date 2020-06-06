package com.company;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/6/415:41
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public interface Myiterator {
    void first();
    void next();
    boolean hasnext();
    boolean isfirst();
    boolean islast();
    Object get();
}
