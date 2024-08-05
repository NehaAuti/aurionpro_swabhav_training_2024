package com.aurionpro.behavioural.command.model;

public class TypeTextCommand implements Command {
    private TextEditor textEditor;
    private String text;

    public TypeTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.typeText(text);
    }

    @Override
    public void undo() {
        textEditor.deleteText(text.length());
    }
}
