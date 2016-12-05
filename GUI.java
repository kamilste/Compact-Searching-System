import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is class for Graphical user interface purposes.
 * It contains all the elements to create GUI for user interaction.
 * 
 * @author Kamil Stepien
 * @version 20/04/15
 */
public class GUI
{
    public GUI()
    {
    }
    
    /**
     * Create graphical elements for user
     */
    public static void main(String[] args)
    {
        //set new frame, assign close button to the frame and set its size
        JFrame frame = new JFrame("Games Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 580);

        //set of panels
        JPanel myPanel = new JPanel(new GridLayout(5, 2));
        JPanel findPanel = new JPanel();
        JPanel resultPanel = new JPanel();
        JPanel imagePanel = new JPanel();

        //set new labels    
        JLabel lblFind = new JLabel("Game Title: ");
        JLabel lblResults = new JLabel("Results: ");
        JLabel lblImage = new JLabel();
        
        //set new textfield
        JTextField textArea = new JTextField();
       
        //set new button
        JButton search = new JButton("Find");

        //add a sub panel to main panel
        frame.add(myPanel);
        myPanel.add(findPanel);
        myPanel.add(resultPanel);
        myPanel.add(imagePanel);
        myPanel.setLayout(null);
        frame.setVisible(true);
        
        //add items to find panel
        findPanel.add(lblFind);
        findPanel.add(textArea);
        textArea.setPreferredSize(new Dimension(200, 24));
        //textArea.setRowFilter(RowFilter.regexFilter("(?i)" + "")
        //textArea.setBounds(50, 50, 150, 150);
        findPanel.add(search);
        findPanel.setSize(500,300); //set size of find panel
        findPanel.setLocation(20, 80); //set location of find panel
        
        //add items to result panel
        resultPanel.add(lblResults); 
        resultPanel.setSize(300, 300); //set size of result panel
        resultPanel.setLocation(50, 130); //set location of result panel
        
        //add items to image panel
        imagePanel.add(lblImage);        
        imagePanel.setSize(250, 250); //set size of image panel
        imagePanel.setLocation(200, 280); //set location of image panel       

        GameCollection gameCollection = new GameCollection();
        
        //searching the title using the text field
        search.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String gameTitle = textArea.getText();
                Game g = gameCollection.searchGame(gameTitle);
                if (g == null)
                {
                    lblResults.setText("We don't have information about this product.");
                    lblResults.setIcon(null);
                    lblImage.setIcon(null);
                }
                else 
                {
                    lblResults.setText(g.toString());
                    gameImage(gameTitle, lblImage);
                }
            }
        }
        );
        
        textArea.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String gameTitle = textArea.getText();
                Game g = gameCollection.searchGame(gameTitle);
                if (g == null)
                {
                    lblResults.setText("We don't have information about this product.");
                    lblResults.setIcon(null);
                    lblImage.setIcon(null);
                }
                else 
                {
                    lblResults.setText(g.toString());
                    gameImage(gameTitle, lblImage);
                }
            }
        }
        );
    }
    
    /**
     * The purpose of this method is to get the picture from a folder and connect it with the matching title
     * @return pict
     */
    public static void gameImage(String title, JLabel lblImage)
    {
        ImageIcon icon = new ImageIcon("./pictures/" + title + ".jpg");
        lblImage.setIcon(icon);
    }
}