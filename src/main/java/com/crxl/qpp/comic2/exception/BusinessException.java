package com.crxl.qpp.comic2.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(Object Obj) {
        super(Obj.toString());
    }

}