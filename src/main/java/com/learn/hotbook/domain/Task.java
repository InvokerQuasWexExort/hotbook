package com.learn.hotbook.domain;

public class Task {

    private int id;
    private String url;//榜单链接
    private int sourceId;//来源
    private int fixedRate;//时间间隔
    private String cssQuery;//抓取路径
    private String namePath;//书名路径
    private String urlPath;//原文链接路径
    private String authorPath;//作者路径
    private String ticketPath;//月票路径

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public int getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(int fixedRate) {
        this.fixedRate = fixedRate;
    }
}
