package com.jianbao.homework.userLogin.exception;

public class MaxTryCountException extends RuntimeException{
    public MaxTryCountException(String msg){
        super(msg);
    }
}
