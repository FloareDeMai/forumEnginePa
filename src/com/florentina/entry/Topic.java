package com.florentina.entry;

import com.florentina.enums.TypeOfTopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Topic extends Entry{
    private String topicTitle;
    private List<Comment> commentList;
    private TypeOfTopic typeOfTopic;

    public Topic(String message, String topicTitle, TypeOfTopic typeOfTopic) {
        super(message);
        this.commentList = new ArrayList<>();
        setTopicTitle(topicTitle);
        this.typeOfTopic = typeOfTopic;
    }

    private void setTopicTitle(String topicTitle){
        if(topicTitle.isEmpty()){
            throw new IllegalArgumentException("Cannot be empty");
        }else{
            this.topicTitle = topicTitle;
        }
    }

    public void addComment(Comment comment){
        commentList.add(comment);
    }

    public List<Comment> getAllModeratedComments(){
      return  commentList.stream().filter(Comment::isModerated).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Topic{" + super.toString() +
                "topicTitle='" + topicTitle + '\'' +
                ", commentList=" + commentList.stream().filter(Comment::isModerated).collect(Collectors.toList()) +
                ", typeOfTopic=" + typeOfTopic +
                '}';
    }
}
