package com.han.java.spring.learn;

/**
 * Created by yhan on 3/8/15.
 */
public class Greeting {
    private final long id;
    private final String content;
    private final String suffix;

    public Greeting(long id, String content, String suffix) {
        this.id = id;
        this.content = content;
        this.suffix = suffix;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getSuffix() {
        return suffix;
    }
}
