package com.learn.hotbook.domain;

/**
 * @ClassName book
 * @Description
 * @Author chenpeng
 * @Date 2020/7/23 9:54
 */
public class Book {

    private int id;
    private String name;//书名
    private String author;//作者
    private String source;//来源
    private String url;//原文链接
    private double score;//分数
    private int cid;//分类id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
