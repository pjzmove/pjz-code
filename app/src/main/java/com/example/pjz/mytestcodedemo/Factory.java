package com.example.pjz.mytestcodedemo;

/**
 * Created by pjz on 2020/4/6.
 */
public class Factory {

    private volatile static Factory instance;
    private Factory(){}

    public static Factory getInstance(){
        if(instance == null){
            synchronized (Factory.class){
                if(instance == null){
                    instance = new Factory();
                }
            }
        }
        return instance;
    }


}
