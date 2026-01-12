package com.texteditor;

import java.util.Stack;

public class UndoRedoManager {

    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    public void recordAction(Action action) {
        undoStack.push(action);
        redoStack.clear(); // clear redo on new action
    }

    public void undo(Editor editor) {
        if (undoStack.isEmpty()) {
            System.out.println("❌ Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("INSERT")) {
            editor.delete(action.text.length());
        } else if (action.type.equals("DELETE")) {
            editor.insert(action.text);
        }

        redoStack.push(action);
    }

    public void redo(Editor editor) {
        if (redoStack.isEmpty()) {
            System.out.println("❌ Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            editor.insert(action.text);
        } else if (action.type.equals("DELETE")) {
            editor.delete(action.text.length());
        }

        undoStack.push(action);
    }
}

