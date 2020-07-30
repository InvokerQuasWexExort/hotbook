package com.learn.hotbook.domain;

import java.util.Date;

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
    private int sourceId;//来源id
    private String url;//原文链接
    private String tag;//标签
    private String channel;//频道
    public static final String CHANNEL_MAN = "男频";
    public static final String CHANNEL_WOMAN = "女频";
    private String wordCount;//字数
    private int scoreCount;//打分人数
    private int state;//状态
    public static final int STATE_ING = 1;//连载中
    public static final int STATE_DONE = 2;//已完结
    public static final int STATE_FAIL = 3;//已太监
    private String img;//封面图
    private int update;//更新状态
    public static final int UPDATE_THREE_DAY = 1;//三日内
    public static final int UPDATE_ONE_MONTH = 2;//一个月内
    public static final int UPDATE_HALF_YEAR = 3;//半年以内
    public static final int UPDATE_OTHER = 4;//其他
    private double score;//分数
    private int classId;//分类id
    private Date createTime;//创建时间

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

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    public int getScoreCount() {
        return scoreCount;
    }

    public void setScoreCount(int scoreCount) {
        this.scoreCount = scoreCount;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }
}
