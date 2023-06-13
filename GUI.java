import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add New Problem");
        // title
        JLabel title = new JLabel("Add New Problem");
        title.setBounds(750, 20, 150, 50);
        frame.add(title);
        // problem id
        JLabel labelPath = new JLabel("Problem ID");
        labelPath.setBounds(100, 100, 100, 50);
        frame.add(labelPath);
        JTextField folderPath = new JTextField();
        folderPath.setBounds(200, 100, 150, 50);
        frame.add(folderPath);
        JButton folderBtn = new JButton("Create");
        folderBtn.setBounds(400,100,100,50);
        folderBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!folderPath.getText().equals("")) {
                    File file = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    file = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText() + "\\answers");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    file = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText() + "\\input");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    file = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText() + "\\output");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    folderPath.setText("");
                }
            }
        });
        frame.add(folderBtn);
        // test case
        JLabel testcaseLabel = new JLabel("Testcase");
        testcaseLabel.setBounds(100, 200, 100, 50);
        frame.add(testcaseLabel);
        JTextField testcaseId = new JTextField();
        testcaseId.setBounds(200, 200, 150, 50);
        frame.add(testcaseId);
        // input
        JLabel inputLabel = new JLabel("Input");
        inputLabel.setBounds(100, 300, 100, 50);
        frame.add(inputLabel);
        JTextArea inputField = new JTextArea();
        inputField.setBounds(200, 300, 550, 200);
        frame.add(inputField);
        // output
        JLabel outputLabel = new JLabel("Output");
        outputLabel.setBounds(100, 600, 100, 50);
        frame.add(outputLabel);
        JTextArea outputField = new JTextArea();
        outputField.setBounds(200, 600, 550, 200);
        frame.add(outputField);
        // statement
        JLabel filenameLabel = new JLabel("Filename");
        filenameLabel.setBounds(900, 100, 100, 50);
        frame.add(filenameLabel);
        JTextField filenameField = new JTextField();
        filenameField.setBounds(1000, 100, 150, 50);
        frame.add(filenameField);
        JLabel difficultyLabel = new JLabel("Difficulty");
        difficultyLabel.setBounds(900, 200, 100, 50);
        frame.add(difficultyLabel);
        JTextField difficultyField = new JTextField();
        difficultyField.setBounds(1000, 200, 150, 50);
        frame.add(difficultyField);
        JLabel statementLabel = new JLabel("Statement");
        statementLabel.setBounds(900, 300, 100, 50);
        frame.add(statementLabel);
        JTextArea statementField = new JTextArea();
        statementField.setBounds(1000, 300, 550, 400);
        frame.add(statementField);
        JButton statementBtn = new JButton("Add");
        statementBtn.setBounds(1000,750,100,50);
        frame.add(statementBtn);
        statementBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!folderPath.getText().equals("") && !filenameField.getText().equals("") && !difficultyField.getText().equals("")) {
                    File file = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText() + "\\problem.txt");
                    try {
                        FileWriter fwt = new FileWriter(file);
                        fwt.write(filenameField.getText() + "\n");
                        fwt.write(difficultyField.getText() + "\n");
                        fwt.write("1\n");
                        String[] state = statementField.getText().split("\\n");
                        for (int i = 0; i < state.length; i++) {
                            fwt.write(state[i]);
                            if (i != state.length - 1) {
                                fwt.write("\n");
                            }
                        }
                        fwt.close();
                        folderPath.setText("");
                        statementField.setText("");
                        filenameField.setText("");
                        difficultyField.setText("");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
        // submit
        JButton Submitbtn = new JButton("Add");
        Submitbtn.setBounds(400,200,100,50);
        frame.add(Submitbtn);
        Submitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!folderPath.getText().equals("") && !testcaseId.getText().equals("")) {
                    File filein = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText() + "\\input\\" + testcaseId.getText() + ".txt");
                    File fileout = new File("C:\\Users\\shanh\\IdeaProjects\\GUI\\folders\\" + folderPath.getText() + "\\output\\" + testcaseId.getText() + ".txt");
                    try {
                        FileWriter fwt = new FileWriter(filein);
                        String[] input = inputField.getText().split("\\n");
                        String[] output = outputField.getText().split("\\n");
                        for (int i = 0; i < input.length; i++) {
                            fwt.write(input[i]);
                            if (i != input.length - 1) {
                                fwt.write("\n");
                            }
                        }
                        fwt.close();
                        fwt = new FileWriter(fileout);
                        for (int i = 0; i < output.length; i++) {
                            fwt.write(output[i] + "\n");
                        }
                        fwt.close();
                        folderPath.setText("");
                        testcaseId.setText("");
                        inputField.setText("");
                        outputField.setText("");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });


        frame.setSize(1800,900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
