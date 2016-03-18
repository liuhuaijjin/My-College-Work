import java.awt.*;
import javax.swing.*;
// http://stackoverflow.com/questions/10968853/two-jpanels-in-jframe-one-under-other
public class GridBagLayout
{
    private void displayGUI()
    {
        JFrame frame = new JFrame("GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 20;
        gbc.gridy = 20;
        gbc.weightx = 1.0;
        gbc.weighty = 0.9;

        JPanel topPanel = new JPanel();
        topPanel.setOpaque(true);
        topPanel.setBackground(Color.WHITE);
        contentPane.add(topPanel, gbc);

        gbc.weighty = 0.1;
        gbc.gridy = 1;

        JPanel bottomPanel = new JPanel();
        bottomPanel.setOpaque(true);    
        bottomPanel.setBackground(Color.BLUE);
        contentPane.add(bottomPanel, gbc);

        frame.setContentPane(contentPane);
        frame.setSize(500, 500);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new GridBagLayout().displayGUI();
            }           
        });
    }
}
