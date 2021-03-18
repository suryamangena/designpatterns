package com.tech.learn.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> editorStatesList = new ArrayList<>();

    public void push(EditorState state){
        editorStatesList.add(state);
    }

    public EditorState pop(){
        var lastIndex = editorStatesList.size()-1;
        var lastState = editorStatesList.get(lastIndex);
        editorStatesList.remove(lastState);

       return editorStatesList.get(editorStatesList.size()-1);
    }




}
