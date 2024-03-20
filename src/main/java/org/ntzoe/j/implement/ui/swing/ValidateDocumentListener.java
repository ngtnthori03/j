package org.ntzoe.j.implement.ui.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class ValidateDocumentListener implements DocumentListener {

    private JTextField textField;

    public ValidateDocumentListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        this.onChange(textField, e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        this.onChange(textField, e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        this.onChange(textField, e);
    }

    public abstract void onChange(JTextField textField, DocumentEvent e);
}
