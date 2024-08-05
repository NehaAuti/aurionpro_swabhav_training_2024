package com.aurionpro.behavioural.command.model;

public class CopyTextCommand implements Command {
    private TextEditor textEditor;

    public CopyTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.copyText();
    }

    @Override
    public void undo() {
        // No undo operation for copy
    }
}
