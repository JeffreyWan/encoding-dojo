package com.wonders.xlab.entity;

import java.io.Serializable;

/**
 * Created by Jeffrey on 2015/4/15.
 */
public class Preg implements Serializable{
    private String fileName;

    private Long size;

    private String detail;

    private String count;

    private String autor;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
