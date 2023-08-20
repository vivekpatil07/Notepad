import java.awt.Color;

public class Colour {
    GUI gui;

    public Colour(GUI gui){
        this.gui = gui;
    }

    public void changeColour(String col){

        switch (col) {

            case "White": gui.window.getContentPane().setBackground(Color.white);
                          gui.textArea.setBackground(Color.white);
                          gui.textArea.setForeground(Color.black);
                          break;

            case "Black": gui.window.getContentPane().setBackground(Color.black);
                          gui.textArea.setBackground(Color.black);
                          gui.textArea.setForeground(Color.white);
                          break;
                          
            case "Blue": gui.window.getContentPane().setBackground(Color.blue);
                          gui.textArea.setBackground(Color.blue);
                          gui.textArea.setForeground(Color.white);
                          break;

            case "Yellow":gui.window.getContentPane().setBackground(Color.YELLOW);
                          gui.textArea.setBackground(Color.YELLOW);
                          gui.textArea.setForeground(Color.BLUE);
                          break;
            
            case "Green":gui.window.getContentPane().setBackground(Color.GREEN);
                          gui.textArea.setBackground(Color.GREEN);
                          gui.textArea.setForeground(Color.white);
                          break;

            case "Gray":gui.window.getContentPane().setBackground(Color.GRAY);
                          gui.textArea.setBackground(Color.GRAY);
                          gui.textArea.setForeground(Color.WHITE);
                          break;

            case "Orange":gui.window.getContentPane().setBackground(Color.orange);
                          gui.textArea.setBackground(Color.ORANGE);
                          gui.textArea.setForeground(Color.BLACK);
                          break;
            
        }
    }
}