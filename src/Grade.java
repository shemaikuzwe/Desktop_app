import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Mar 17 19:14:42 SAST 2024
 */



/**
 * @author shema
 */
public class Grade extends JFrame {


    public Grade() {
        initComponents();
    }

    private void ExitBtnClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void ClearBtnClicked(MouseEvent e) {
        // TODO add your code here
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
    }

    private void CalculateBtnClicked(MouseEvent e) {
        // TODO add your code here
        double grades;
        grades=Double.parseDouble(textField1.getText());
        if(grades>=88 && grades<=100){
           textField3.setText("A");
           textField2.setText(Double.toString(grades));
        } else if(grades>=78 && grades <=87){
            textField3.setText("B");
            textField2.setText(Double.toString(grades));
        }
        else if(grades<=77 && grades>=68){
           textField3.setText("C");
           textField2.setText(Double.toString(grades));
        }
        else if(grades<=67 && grades>=58){
           textField3.setText("C");
           textField2.setText(Double.toString(grades));
        }
        else if(grades<=57){
            textField3.setText("C");
            textField2.setText(Double.toString(grades));
        }
        else{
            textField3.setText("invalid input");
            textField2.setText("invalid input");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Shemaa Elisa
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        label3 = new JLabel();
        textField2 = new JTextField();
        button2 = new JButton();
        label4 = new JLabel();
        textField3 = new JTextField();
        button3 = new JButton();

        //======== this ========
        setTitle("Grade Calculator");
        setBackground(new Color(0x333333));
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Images/calculator.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));

        //---- label1 ----
        label1.setText("Grade Calculator");
        label1.setFont(new Font("Tahoma", Font.BOLD, 18));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label1, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label2 ----
        label2.setText("Garde:");
        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(label2, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(textField1, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button1 ----
        button1.setText("Enter");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CalculateBtnClicked(e);
            }
        });
        contentPane.add(button1, new GridConstraints(1, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label3 ----
        label3.setText("Avarage:");
        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(label3, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(textField2, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button2 ----
        button2.setText("Clear");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ClearBtnClicked(e);
            }
        });
        contentPane.add(button2, new GridConstraints(2, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label4 ----
        label4.setText(" Final grade: ");
        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        contentPane.add(label4, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(textField3, new GridConstraints(3, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button3 ----
        button3.setText("Exit");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ExitBtnClicked(e);
            }
        });
        contentPane.add(button3, new GridConstraints(3, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        setSize(735, 450);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Shemaa Elisa
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JLabel label3;
    private JTextField textField2;
    private JButton button2;
    private JLabel label4;
    private JTextField textField3;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception error){
            error.printStackTrace();
        }
        Grade grade=new Grade();
          grade.setVisible(true);
    }
}
