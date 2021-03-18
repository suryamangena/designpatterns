package com.tech.learn;

import com.tech.learn.memento.Editor;
import com.tech.learn.memento.History;


public class Main {

    public static void main(String[] args) {
	// write your code here

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}
