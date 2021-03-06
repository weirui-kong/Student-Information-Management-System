package FusionUIAsset;

import javax.swing.*;

/**
 * This is a fusion class.
 * Extends DoublePanel.
 *
 * @author Kong Weirui
 * @since 2.5
 */
public class QuickPanelWithLabelAndText extends DoublePanel {
    public JLabel label = new JLabel("");
    public JTextField text = new JTextField("", 10);
    //错误动画必要操作
    //减少繁杂操作必须暴露

    public QuickPanelWithLabelAndText(String labelText) {
        super(2, 1);
        label.setText(labelText);
        super.add(label, text);
    }

    public QuickPanelWithLabelAndText(String labelText, int columns) {
        this(labelText);
        text.setColumns(columns);
    }

    public QuickPanelWithLabelAndText(String labelText, String textAreaText) {
        super(2, 1);
        label.setText(labelText);
        text.setText(textAreaText);
        super.add(label, text);
    }

    public void setTextEnabled(boolean b) {
        text.setEnabled(b);
    }

    public String getFilteredText() {
        if (text.getText().length() < 1) return "0";
        return text.getText();
    }

    public void setText(String t) {
        text.setText(t);
    }

    public void setText(String t, boolean b) {
        text.setText(t);
        text.setEnabled(b);
    }

}
