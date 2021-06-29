package com.florentina.entry;

public class Comment extends Entry{
    private boolean isModerated;

    public Comment(String message) {
        super(message);
        this.isModerated = false;
    }

    public void toggleCommentState(){
        isModerated = !isModerated;
    }

    public boolean isModerated() {
        return isModerated;
    }

}
