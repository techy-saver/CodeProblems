package com.varaprasadps.dsa.domain;

/**
 * @author by Vara Prasad.
 */
public class Result<T> {

    private T data;
    private Integer length;

    public Result(T data, Integer length) {
        this.data = data;
        this.length = length;
    }

    public T getData() {
        return data;
    }

    public Integer getLength() {
        return length;
    }

}
