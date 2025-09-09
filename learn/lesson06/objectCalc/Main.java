//複写

import javax.swing.*;       // Swingの部品を使う
import javax.swing.border.EmptyBorder;

import java.awt.*;          // レイアウト管理用
import java.awt.event.*;    // ボタンのクリック処理用
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener {
    
    private JTextField display;
    private ArrayList<String> inputList = new ArrayList<>(); // ボタン入力を保

    public Main() {
        // ウィンドウ設定
        setTitle("電卓");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());  // 上に表示、下にボタンのレイアウト

        // 表示部分
        display = new JTextField();
        display.setEditable(false); 
        display.setFont(new Font("Arial", Font.PLAIN, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
       
        // 直接入力できないようにする
        add(display, BorderLayout.NORTH);
        
        JPanel buttonPanel  = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4,5,5));
        
        String[] buttons = { "1", "2", "3", "÷","4", "5","6","x", "7", "8", "9","-", "0","00",".","+","C","","","="};
        
        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.PLAIN, 24));
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }
        add(buttonPanel, BorderLayout.CENTER);
        
        setVisible(true);
    }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = ((JButton) e.getSource()).getText();

            if (cmd.equals("C")) {
                inputList.clear();
                display.setText("");
            } else if (cmd.equals("=")) {
                String expression = String.join("", inputList);
                try {
                    double result = evaluate(expression);
                    display.setText(String.valueOf(result));
                    inputList.clear();
                    inputList.add(String.valueOf(result)); // 続けて計算できるようにする
                } catch (Exception ex) {
                    display.setText("Error");
                    inputList.clear();
                }
            } else {
                inputList.add(cmd);
                display.setText(String.join("", inputList));
            }
        }
        
     // 四則演算（掛け算・割り算を優先）
        private double evaluate(String expr) {
            expr = expr.replace("×", "*").replace("÷", "/");

            // 数字と演算子に分割
            List<String> tokens = new ArrayList<>();
            StringBuilder number = new StringBuilder();
            for (char c : expr.toCharArray()) {
                if (Character.isDigit(c) || c == '.') {
                    number.append(c);
                } else {
                    tokens.add(number.toString());
                    number.setLength(0);
                    tokens.add(String.valueOf(c));
                }
            }
            if (number.length() > 0) tokens.add(number.toString());

            
            // 先に * / を処理
            List<String> temp = new ArrayList<>();
            double num = Double.parseDouble(tokens.get(0));
            for (int i = 1; i < tokens.size(); i += 2) {
                String op = tokens.get(i);
                double next = Double.parseDouble(tokens.get(i + 1));
                if (op.equals("*")) {
                    num *= next;
                } else if (op.equals("/")) {
                    num /= next;
                } else {
                    temp.add(String.valueOf(num));
                    temp.add(op);
                    num = next;
                }
            }
            temp.add(String.valueOf(num));

            // 次に + - を処理
            double result = Double.parseDouble(temp.get(0));
            for (int i = 1; i < temp.size(); i += 2) {
                String op = temp.get(i);
                double next = Double.parseDouble(temp.get(i + 1));
                if (op.equals("+")) {
                    result += next;
                } else if (op.equals("-")) {
                    result -= next;
                }
            }

            return result;
        }

        

        public static void main(String[] args) {
            new Main();
 
    
    }
}