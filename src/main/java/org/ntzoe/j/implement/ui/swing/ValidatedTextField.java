package org.ntzoe.j.implement.ui.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ValidatedTextField extends JTextField {

    private String pattern;
    private String message;

    /** ( reactive )
     * label to show validation message
     */
    private JLabel messageLabel;


    public ValidatedTextField(String pattern, String message, JLabel label) {
        this.message = message;
        this.pattern = pattern;
        this.messageLabel = label;
    }

    protected void initValidate () {

        this.getDocument().addDocumentListener(new ValidateDocumentListener(this) {
            @Override
            public void onChange(JTextField textField, DocumentEvent e) {
                textField.getText().matches(pattern);
            }
        });

    }

    public JLabel getMessageLabel() {
        return this.messageLabel;
    }
}
