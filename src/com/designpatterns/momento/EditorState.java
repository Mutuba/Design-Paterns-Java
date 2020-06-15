package com.designpatterns.momento;

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    // returns the content of EditorState
    public String getContent() {
        return content;
    }
}
