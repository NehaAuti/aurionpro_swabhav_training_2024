package com.aurionpro.behavioural.command.model;

public class PasteTextCommand implements Command {
    private TextEditor textEditor;

    public PasteTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.pasteText();
    }

    @Override
    public void undo() {
        textEditor.deleteText(textEditor.getLastPastedText().length());
    }
}

