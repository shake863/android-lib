package me.adanchou.utils;

/**
 * Created by adanchou on 16/11/22.
 */

public class LogTag {

    private String tag;

    public LogTag(String tag) {

        this.tag = tag;
    }


    public String name() {
        return this.tag;
    }

    @Override
    public String toString() {
        return this.tag;
    }
}
