package client.view;

public class View {
  public static void gui() {
    System.out.print("UI Start");

    JFrame frame = new JFrame("GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setBackground(Color.red);
    
    frame.setPreferredSize(new Dimension(400, 300));
    frame.pack();
    frame.setLocationRelativeTo(null);

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    frame.getContentPane().add(button1);
    frame.getContentPane().add(button2);
    frame.setVisible(true);
  }
}
