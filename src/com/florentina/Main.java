package com.florentina;

import com.florentina.entry.Comment;
import com.florentina.entry.Topic;
import com.florentina.enums.TypeOfTopic;
import com.florentina.forum.Forum;

public class Main {

    public static void main(String[] args) {
        Forum forum = Forum.getInstance();

        Comment comment = new Comment("Acesta este un comentariu");
        Comment comment1 = new Comment("Comentariul numarul 2");
        Comment comment2 = new Comment("Comentariul numarul 3");
        Comment comment3 = new Comment("Comentariul numarul 4");
        Comment comment4 = new Comment("Comentariul numarul 5");

        Topic topic = new Topic("Frumusetea este trecatoare", "Beauty", TypeOfTopic.REGULAR);


        comment.toggleCommentState();
        comment1.toggleCommentState();
        comment2.toggleCommentState();

        topic.addComment(comment);
        topic.addComment(comment1);
        topic.addComment(comment2);
        topic.addComment(comment3);
        topic.addComment(comment4);
        forum.addTopic(topic);
        System.out.println(forum.getTopicList());






    }
}
