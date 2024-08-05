package com.aurionpro.behavioural.command.test;

import com.aurionpro.behavioural.command.model.Command;
import com.aurionpro.behavioural.command.model.CopyTextCommand;
import com.aurionpro.behavioural.command.model.PasteTextCommand;
import com.aurionpro.behavioural.command.model.TextEditor;
import com.aurionpro.behavioural.command.model.TextEditorInvoker;
import com.aurionpro.behavioural.command.model.TypeTextCommand;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorInvoker textEditorInvoker = new TextEditorInvoker();

        // Typing text
        Command typeHelloCommand = new TypeTextCommand(textEditor, "Hello ");
        textEditorInvoker.executeCommand(typeHelloCommand);

        Command typeWorldCommand = new TypeTextCommand(textEditor, "World!");
        textEditorInvoker.executeCommand(typeWorldCommand);

        // Copying text
        Command copyCommand = new CopyTextCommand(textEditor);
        textEditorInvoker.executeCommand(copyCommand);

        // Pasting text
        Command pasteCommand = new PasteTextCommand(textEditor);
        textEditorInvoker.executeCommand(pasteCommand);

        // Undo last command (paste)
        textEditorInvoker.undoLastCommand();

        // Undo typing "World!"
        textEditorInvoker.undoLastCommand();
    }
}
