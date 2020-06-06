package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/6/415:43
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Myiteratorimp {
    private List<Object> list = new ArrayList<Object>();


    public void addobject(Object object){
        list.add(object);
    }
    public  void removeobject(Object object){
        list.remove(object);
    }

    public Myiterator  createit(){
        return new concrete();
    }



    private  class concrete implements  Myiterator{
        private int index;
        @Override
        public void first() {
                index=0;
        }

        @Override
        public void next() {
            if(index<list.size()){
                index++;
            }

        }

        @Override
        public boolean hasnext() {
            if(index<list.size()){
                return  true;

            }
            return false;
        }

        @Override
        public boolean isfirst() {
            return index==0?true:false;
        }

        @Override
        public boolean islast() {
            return index==list.size()-1?true:false;
        }

        @Override
        public Object get() {
            return list.get(index);
        }
    }
}
