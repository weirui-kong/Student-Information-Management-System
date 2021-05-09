import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddStudentDialog extends JDialog
{
    //最开始的时候都把swing控件写在构造函数里了，后来又全部移出来，方便操作
    //最开始的时候都把swing控件写在构造函数里了，后来又全部移出来，方便操作
    //最开始的时候都把swing控件写在构造函数里了，后来又全部移出来，方便操作
    JComboBox degreeCB, genderCB;
    QuickPanelWithLabelAndText a_IDP;
    JPanel a_genderP;
    QuickPanelWithLabelAndText a_nameP;
    QuickPanelWithLabelAndText a_majorP;
    QuickPanelWithLabelAndText a_tutorP;
    QuickPanelWithLabelAndText a_dormP;
    QuickPanelWithLabelAndText a_labP;
    JDialog addDialog = new JDialog();
    JButton addBtn = new JButton();

    public AddStudentDialog(Frame owner, String title, boolean modal)
    {
        super(owner, title, modal);
//owner.setEnabled(false);
        JPanel addStuPanel = new JPanel(new GridLayout(10, 1));
        addDialog.add(addStuPanel, BorderLayout.CENTER);


        //topPanel
        JPanel tpp = new JPanel(new FlowLayout());
        tpp.add(new JLabel("添加学生"));
        addStuPanel.add(tpp);
        //学位类别
        JPanel degreeP = new JPanel(new FlowLayout());
        degreeP.add(new JLabel("学历："));
        String[] degree = {"本科", "硕士", "博士"};
        degreeCB = new JComboBox(degree);
        degreeP.add(degreeCB);
        addStuPanel.add(degreeP);
        //标准信息
        a_nameP = new QuickPanelWithLabelAndText("  姓名:");
        addStuPanel.add(a_nameP);
        a_IDP = new QuickPanelWithLabelAndText("  学号:");
        addStuPanel.add(a_IDP);
        a_genderP = new JPanel();
        a_genderP.setLayout(new FlowLayout());
        a_genderP.add(new JLabel("性别"));
        String[] gender = {"顺性男 Cis Man", "顺性女 Cis Woman", "双性人 Bigender", "无性别 Agender",
                "跨性别 Trans", "流性人 Gender Fluid", "非常规 Nonconforming", "酷儿性别 Genderqueer",
                "间性人 Intersex", "泛性别 Pangender", "不确定"};
        genderCB = new JComboBox(gender);
        a_genderP.add(genderCB);
        addStuPanel.add(a_genderP);

        a_majorP = new QuickPanelWithLabelAndText("  专业班级:");
        addStuPanel.add(a_majorP);
        a_dormP = new QuickPanelWithLabelAndText("寝室号:");
        addStuPanel.add(a_dormP);
        a_tutorP = new QuickPanelWithLabelAndText("  导师:", "...");
        addStuPanel.add(a_tutorP);
        a_tutorP.setText("不可用", false);
        a_labP = new QuickPanelWithLabelAndText("实验室:", "...");
        addStuPanel.add(a_labP);
        a_labP.setText("不可用", false);
        addBtn = new JButton("确认添加");
        addStuPanel.add(addBtn);
        addBtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent e)
            {
                super.mouseReleased(e);
                switch (degree[degreeCB.getSelectedIndex()])
                {
                    case "本科":
                        //MainWindow.studentArrayList.add(new Bachelor(a_nameP.text.getText(),a_IDP.text.getText()))
                        break;
                    case "硕士":
                        break;
                    case "博士":
                        break;
                }
            }
        });
        //根据学位选择是否展示tutor和lab
        degreeCB.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (degreeCB.getSelectedItem().equals("本科"))
                {
                    a_tutorP.setText("不可用", false);
                    a_labP.setText("不可用", false);
                }
                if (degreeCB.getSelectedItem().equals("硕士"))
                {
                    a_tutorP.setText("", true);
                    a_labP.setText("不可用", false);
                }
                if (degreeCB.getSelectedItem().equals("博士"))
                {
                    a_tutorP.setText("", true);
                    a_labP.setText("", true);
                }
            }
        });

//        JButton b = new JButton(Integer.toString((int) System.currentTimeMillis()));
//        addDialog.add(b);
//        b.addMouseListener(new MouseAdapter()
//        {
//            @Override
//            public void mouseReleased(MouseEvent e)
//            {
//                super.mouseReleased(e);
//                owner.setEnabled(true);
//                addDialog.dispose();
//            }
//        });
        SimpleMotion.openMotion(addDialog, 300, 500);
    }
}
