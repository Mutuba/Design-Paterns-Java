package com.designpatterns.momento;

public class Editor {

    private String content;
    // creates an instance of EditorState and returns it
    public EditorState createState(){
        return new EditorState(content);
    }
    // sets editor's content to EditorState's content
    public void restore(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    // takes a string and sets it as editor's content
    public void setContent(String content) {
        this.content = content;
    }
}