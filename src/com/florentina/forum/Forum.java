package com.florentina.forum;

import com.florentina.entry.Topic;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private static Forum instance = null;
    private List<Topic> topicList = new ArrayList<>();
    private String titleForum;

    private Forum(){
        this.titleForum = "My wonderful forum";
    }

    public static Forum getInstance(){
        if(instance == null){
            instance = new Forum();
        }
        return instance;
    }

    public String getTitleForum() {
        return titleForum;
    }

    public void addTopic (Topic topic){
        topicList.add(topic);
    }

    public List<Topic> getTopicList() {
        return topicList;
    }


}
