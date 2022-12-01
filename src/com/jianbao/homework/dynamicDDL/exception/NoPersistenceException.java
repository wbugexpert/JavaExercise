package com.jianbao.homework.dynamicDDL.exception;

public class NoPersistenceException extends RuntimeException{
    public NoPersistenceException(){}
    public NoPersistenceException(String msg){
        super(msg);
    }
}
