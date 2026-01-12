package com.texteditor;

public class Editor {

    private StringBuilder text = new StringBuilder();

    public void insert(String value) {
        text.append(value);
    }

    public void delete(int length) {
        text.delete(text.length() - length, text.length());
    }

    public String getText() {
        return text.toString();
    }

    public int length() {
        return text.length();
    }
}
