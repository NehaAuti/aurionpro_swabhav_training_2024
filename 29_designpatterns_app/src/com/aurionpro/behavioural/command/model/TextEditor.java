package com.aurionpro.behavioural.command.model;

public class TextEditor {
    private StringBuilder text;
    private String clipboard;
    private String lastPastedText;

    public TextEditor() {
        text = new StringBuilder();
        clipboard = "";
        lastPastedText = "";
    }

    public void typeText(String text) {
        this.text.append(text);
        System.out.println("Current Text: " + this.text);
    }

    public void deleteText(int length) {
        int start = text.length() - length;
        if (start >= 0) {
            text.delete(start, text.length());
        }
        System.out.println("Current Text: " + this.text);
    }

    public void copyText() {
        clipboard = text.toString();
        System.out.println("Copied Text: " + clipboard);
    }

    public void pasteText() {
        lastPastedText = clipboard;
        text.append(clipboard);
        System.out.println("Current Text: " + text);
    }

    public String getLastPastedText() {
        return lastPastedText;
    }
}
