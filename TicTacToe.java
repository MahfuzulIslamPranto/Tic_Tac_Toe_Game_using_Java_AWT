package tictactoe;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends WindowAdapter implements ActionListener{
    Frame frame;
    Button button,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    Label label;
    int count=0;
    String letter;
    TicTacToe(){
        //Main Frame,Button,Label initialization:
        frame = new Frame("Tic-Tac-Toe Board");
        button = new Button();        
        label = new Label();
        //End
        
        //Button utilities:
        bt1 = new Button();
        bt1.setBackground(Color.cyan);
        bt1.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt1.setBounds(55,70,100,100);
        
        bt2 = new Button();
        bt2.setBackground(Color.cyan);
        bt2.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt2.setBounds(155,70,100,100);
        
        bt3 = new Button();
        bt3.setBackground(Color.cyan);
        bt3.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt3.setBounds(255,70,100,100);
        
        bt4 = new Button();
        bt4.setBackground(Color.cyan);
        bt4.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt4.setBounds(55,170,100,100);
        
        bt5 = new Button();
        bt5.setBackground(Color.cyan);
        bt5.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt5.setBounds(155,170,100,100);
        
        bt6 = new Button();
        bt6.setBackground(Color.cyan);
        bt6.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt6.setBounds(255,170,100,100);
        
        bt7 = new Button();
        bt7.setBackground(Color.cyan);
        bt7.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt7.setBounds(55,270,100,100);
        
        bt8 = new Button();
        bt8.setBackground(Color.cyan);
        bt8.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt8.setBounds(155,270,100,100);
        
        bt9 = new Button();
        bt9.setBackground(Color.cyan);
        bt9.setFont(new Font("SansSerif", Font.BOLD, 50));
        bt9.setBounds(255,270,100,100);
        
        bt10 = new Button("RESET");
        bt10.setBackground(Color.green);
        bt10.setForeground(Color.white);
        bt10.setFont(new Font("SansSerif",Font.BOLD,20));
        bt10.setBounds(55,380,300,30);
        //End
        
        //Label utilities:
        label.setBounds(55,35,300,40);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("SansSerif",Font.BOLD,20));
        //End
        
        //adding button & label to the frame:
        frame.add(button);
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);
        frame.add(bt7);
        frame.add(bt8);
        frame.add(bt9);
        frame.add(bt10);
        
        frame.add(label);
        //End
        
        //Button and Frame Action:
        button.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);
        
        frame.addWindowListener(this);
        //End
        
        //Frame utilities:
        frame.setSize(400,440);
        frame.setResizable(false);
        frame.setBackground(Color.lightGray);
        frame.setLayout(null);
        frame.setVisible(true);
        //End
    }
    @Override
    public void windowClosing(WindowEvent e){
        frame.dispose();
    }
    
    //Main_Action:
    @Override
    public void actionPerformed(ActionEvent e) {
      count++;
      if(count==1||count==3||count==5||count==7||count==9){
          letter="X";
      }
      else if(count==2||count==4||count==6||count==8){
          letter="O";
      }
      if(e.getSource()==bt1){
          bt1.setLabel(letter);
          bt1.setEnabled(false);
      }
      else if(e.getSource()==bt2){
          bt2.setLabel(letter);
          bt2.setEnabled(false);
      }
      else if(e.getSource()==bt3){
          bt3.setLabel(letter);
          bt3.setEnabled(false);
      }
      else if(e.getSource()==bt4){
          bt4.setLabel(letter);
          bt4.setEnabled(false);
      }
      else if(e.getSource()==bt5){
          bt5.setLabel(letter);
          bt5.setEnabled(false);
      }
      else if(e.getSource()==bt6){
          bt6.setLabel(letter);
          bt6.setEnabled(false);
      }
      else if(e.getSource()==bt7){
          bt7.setLabel(letter);
          bt7.setEnabled(false);
      }
      else if(e.getSource()==bt8){
          bt8.setLabel(letter);
          bt8.setEnabled(false);
      }
      else if(e.getSource()==bt9){
          bt9.setLabel(letter);
          bt9.setEnabled(false);
      }
      else if(e.getSource()==bt10){
          letter = "";
          count = 0;
     
          bt1.setEnabled(true);
          bt2.setEnabled(true);
          bt3.setEnabled(true);
          bt4.setEnabled(true); 
          bt5.setEnabled(true);
          bt6.setEnabled(true);
          bt7.setEnabled(true);
          bt8.setEnabled(true);
          bt9.setEnabled(true);
    
          bt1.setLabel("");
          bt2.setLabel("");
          bt3.setLabel("");
          bt4.setLabel("");
          bt5.setLabel("");
          bt6.setLabel("");
          bt7.setLabel("");
          bt8.setLabel("");
          bt9.setLabel("");
          bt9.setLabel("");
          label.setText("");
    
          boolean win = false;
      }
      checkWinner();
    }
    private void checkWinner() {
    //Check Horizontally
    Boolean win = null;
    if (bt1.getLabel() == bt2.getLabel() && bt2.getLabel() == bt3.getLabel() && bt1.getLabel() != "" && bt2.getLabel() != "" && bt3.getLabel() != "") {
        win = true;
    }

    //Check Horizontally
    else if (bt4.getLabel() == bt5.getLabel() && bt5.getLabel() == bt6.getLabel() && bt4.getLabel() != "" && bt5.getLabel() != "" && bt6.getLabel() != "") {
        win = true;
    }

    //Check Horizontally
    else if (bt7.getLabel() == bt8.getLabel() && bt8.getLabel() == bt9.getLabel() && bt7.getLabel() != "" && bt8.getLabel() != "" && bt9.getLabel() != "") {
        win = true;
    }

    //Check Vertically
    else if (bt1.getLabel() == bt4.getLabel() && bt4.getLabel() == bt7.getLabel() && bt1.getLabel() != "" && bt4.getLabel() != "" && bt7.getLabel() != "") {
        win = true;
    }

    //Check Vertically
    else if (bt2.getLabel() == bt5.getLabel() && bt5.getLabel() == bt8.getLabel() && bt2.getLabel() != "" && bt5.getLabel() != "" && bt8.getLabel() != "") {
        win = true;
    } else if (bt3.getLabel() == bt6.getLabel() && bt6.getLabel() == bt9.getLabel() && bt3.getLabel() != "" && bt6.getLabel() != "" && bt9.getLabel() != "") {
        win = true;
    }

    //Check Diagonally
    else if (bt1.getLabel() == bt5.getLabel() && bt5.getLabel() == bt9.getLabel() && bt1.getLabel() != "" && bt5.getLabel() != "" && bt9.getLabel() != "") {
        win = true;
    }

    //Check Diagonally
    else if (bt3.getLabel() == bt5.getLabel() && bt5.getLabel() == bt7.getLabel() && bt3.getLabel() != "" && bt5.getLabel() != "" && bt7.getLabel() != "") {
        win = true;
    } else {
        win = false;
    }

    if (win) {
        label.setText("Hurray! Player " + letter + " wins!");
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);
        bt8.setEnabled(false);
        bt9.setEnabled(false);

    } else if (!win && count == 9) {
        label.setText("The game ended in a tie!");
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);
        bt8.setEnabled(false);
        bt9.setEnabled(false);
    }
}
    
    public static void main(String[] args) {
        new TicTacToe();
    }

    
}
