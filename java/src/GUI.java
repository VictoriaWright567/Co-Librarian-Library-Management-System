import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.*;

public class GUI implements ActionListener {
    public GUI() {

        //initialization of GUI objects
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        JPanel menuPanel1 = new JPanel();
        menuPanel1.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        menuPanel1.setLayout(new GridBagLayout());
        JPanel menuPanel2 = new JPanel();
        menuPanel2.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        menuPanel2.setLayout(new GridBagLayout());
        JPanel menuPanel3 = new JPanel();
        menuPanel3.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        menuPanel3.setLayout(new GridLayout(0,2));
        menuPanel.add(menuPanel1);
        menuPanel.add(menuPanel2);
        menuPanel.add(menuPanel3);

        JLabel title = new JLabel("Colibrarian Library Management System");
        title.setFont(new Font("Sans Serif", Font.PLAIN, 16));
        menuPanel1.add(title);

        try {
            BufferedImage img = ImageIO.read(new File("java/src/booklogo.jpeg"));
            Image bookLogo = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            JLabel picLabel = new JLabel(new ImageIcon(bookLogo));
            menuPanel2.add(picLabel);
        }catch(IOException ex){
            ex.printStackTrace();
            System.out.println(ex);
        }


        JButton formButton = new JButton("Book Entry");
        menuPanel3.add(formButton);
        JButton searchButton = new JButton("Search Library");
        menuPanel3.add(searchButton);

        JLabel label = new JLabel("Book ID");
        JTextField txt = new JTextField();
        JLabel label1 = new JLabel("Book Author");
        JTextField txt1 = new JTextField();
        JLabel label2 = new JLabel("Book Title");
        JTextField txt2 = new JTextField();
        JLabel label3 = new JLabel("Book Other Title");
        JTextField txt3 = new JTextField();
        JLabel label4 = new JLabel("Book Email");
        JTextField txt4 = new JTextField();
        JLabel label5 = new JLabel("Book Language");
        JTextField txt5 = new JTextField();
        JLabel label6 = new JLabel("Book Series");
        JTextField txt6 = new JTextField();
        JLabel label7 = new JLabel("Book Subject");
        JTextField txt7 = new JTextField();
        JLabel label8 = new JLabel("Book Content Type");
        JTextField txt8 = new JTextField();
        JLabel label9 = new JLabel("Book URL");
        JTextField txt9 = new JTextField();
        JLabel label10 = new JLabel("Book Place of Publication");
        JTextField txt10 = new JTextField();
        JLabel label11 = new JLabel("Book Publisher");
        JTextField txt11 = new JTextField();
        JLabel label12 = new JLabel("Book Date of Publication");
        JTextField txt12 = new JTextField();
        JLabel label13 = new JLabel("Book Copyright Date");
        JTextField txt13 = new JTextField();
        JLabel label14 = new JLabel("Book ISBN");
        JTextField txt14 = new JTextField();
        JLabel label15 = new JLabel("Book Extent");
        JTextField txt15 = new JTextField();
        JLabel label16 = new JLabel("Book Illustrative Content");
        JTextField txt16 = new JTextField();
        JLabel label17 = new JLabel("Book Color");
        JTextField txt17 = new JTextField();
        JLabel label18 = new JLabel("Book Dimensions");
        JTextField txt18 = new JTextField();
        JLabel label19 = new JLabel("Book Contributor");
        JTextField txt19 = new JTextField();
        JLabel label20 = new JLabel("Book Keywords");
        JTextField txt20 = new JTextField();
        JLabel label21 = new JLabel("Book Notes");
        JTextField txt21 = new JTextField();

        JPanel panel2 = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panel2);

        panel2.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        panel2.setLayout(new GridLayout(0,2));
        panel2.add(label);
        panel2.add(txt);
        panel2.add(label1);
        panel2.add(txt1);
        panel2.add(label2);
        panel2.add(txt2);
        panel2.add(label3);
        panel2.add(txt3);
        panel2.add(label4);
        panel2.add(txt4);
        panel2.add(label5);
        panel2.add(txt5);
        panel2.add(label6);
        panel2.add(txt6);
        panel2.add(label7);
        panel2.add(txt7);
        panel2.add(label8);
        panel2.add(txt8);
        panel2.add(label9);
        panel2.add(txt9);
        panel2.add(label10);
        panel2.add(txt10);
        panel2.add(label11);
        panel2.add(txt11);
        panel2.add(label12);
        panel2.add(txt12);
        panel2.add(label13);
        panel2.add(txt13);
        panel2.add(label14);
        panel2.add(txt14);
        panel2.add(label15);
        panel2.add(txt15);
        panel2.add(label16);
        panel2.add(txt16);
        panel2.add(label17);
        panel2.add(txt17);
        panel2.add(label18);
        panel2.add(txt18);
        panel2.add(label19);
        panel2.add(txt19);
        panel2.add(label20);
        panel2.add(txt20);
        panel2.add(label21);
        panel2.add(txt21);

        JButton backButton = new JButton("back");
        JButton addButton = new JButton("add");
        panel2.add(backButton);
        panel2.add(addButton);

        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.Y_AXIS));
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(0,3));
        JLabel searchLabel = new JLabel("Search for Book");
        JTextField searchBar = new JTextField();
        JButton searchButton2 = new JButton("search");
        panel3.add(searchLabel);
        panel3.add(searchBar);
        panel3.add(searchButton2);
        //JPanel panel4 = new JPanel();
        JTextArea searchResults = new JTextArea(100,100);
        searchResults.setEditable(true);
        searchResults.setBackground(Color.WHITE);
        JScrollPane textPanel = new JScrollPane(searchResults);
        //panel4.add(searchResults);
        //JScrollPane scrollPane2 = new JScrollPane();
        //scrollPane2.add(searchResults);
        JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayout(0,2));
        JButton backButton2 = new JButton("back");
        JButton jsonButton = new JButton("Populate JSON");
        panel5.add(backButton2);
        panel5.add(jsonButton);

        searchPanel.add(panel3);
        searchPanel.add(textPanel);
        searchPanel.add(panel5);

        //button action listeners

        //button for returning to menu
        backButton2.addActionListener(e ->{
            frame.setContentPane(menuPanel);
            frame.invalidate();
            frame.validate();
            frame.setSize(400,300);
        });

        //button for adding book data to json file
        jsonButton.addActionListener(e ->{
            populateJSON.saveToJSON();
            JOptionPane.showMessageDialog(frame, "JSON file saved successfully!");
        });

        //button for navigating to book entry form
        formButton.addActionListener(e ->{
            frame.setContentPane(scrollPane);
            frame.invalidate();
            frame.validate();
            frame.setSize(800,800);
        });

        //button for navigating to book search
        searchButton.addActionListener(e ->{
            frame.setContentPane(searchPanel);
            frame.invalidate();
            frame.validate();
            frame.setSize(500,500);
        });

        //button for searching up book in the database
        searchButton2.addActionListener(e ->{
            String myUrl = "jdbc:mysql://localhost:3306/mysql";
            String sql = "select * from colibrariandb.Books where book_title like ? or book_subject like ? or book_author like ? or " +
                    "book_keywords like ? or book_publisher like ?";

            try {
                Connection conn = DriverManager.getConnection(myUrl, "root", "k4@@xCP/pLyM&\\m");
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                String searchText = searchBar.getText() + "%";
                preparedStatement.setString(1, searchText);
                preparedStatement.setString(2, searchText);
                preparedStatement.setString(3, searchText);
                preparedStatement.setString(4, searchText);
                preparedStatement.setString(5, searchText);

                ResultSet result = preparedStatement.executeQuery();
                ResultSetMetaData rsmd = result.getMetaData();
                int colNum = rsmd.getColumnCount();
                String text = "";
                searchResults.setText("");

                while(result.next()){
                    for(int i = 1; i <= colNum; i++){
                        if(i > 1){
                            text += result.getMetaData().getColumnName(i) + ": " + result.getString(i) + " \n";
                        }

                    }
                    searchResults.append(text);
                }

                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
            }
        });

        //button for returning to menu
        backButton.addActionListener(e ->{
            frame.setContentPane(menuPanel);
            frame.invalidate();
            frame.validate();
            frame.setSize(400,300);
        });

        //button for adding new book to the database
        addButton.addActionListener(e -> {
            String myUrl = "jdbc:mysql://localhost:3306/mysql";
            String sql = " insert into colibrariandb.Books(book_ID, book_author, book_title, book_othertitle, book_email," +
                    " book_language, book_series, book_subject, book_contentType, book_URL, book_placeOfPublication," +
                    " book_publisher, book_dateOfPublication, book_copyrightDate, book_isbn, book_extent, book_illustrativeContent," +
                    " book_color, book_dimensions, book_contributor, book_keywords, book_notes)" +
                    " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try {
                Connection conn = DriverManager.getConnection(myUrl, "root", "k4@@xCP/pLyM&\\m");
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, Integer.parseInt(txt.getText()));
                preparedStatement.setString(2, txt1.getText());
                preparedStatement.setString(3, txt2.getText());
                preparedStatement.setString(4, txt3.getText());
                preparedStatement.setString(5, txt4.getText());
                preparedStatement.setString(6, txt5.getText());
                preparedStatement.setString(7, txt6.getText());
                preparedStatement.setString(8, txt7.getText());
                preparedStatement.setString(9, txt8.getText());
                preparedStatement.setString(10, txt9.getText());
                preparedStatement.setString(11, txt10.getText());
                preparedStatement.setString(12, txt11.getText());
                preparedStatement.setInt(13, Integer.parseInt(txt12.getText()));
                preparedStatement.setInt(14, Integer.parseInt(txt13.getText()));
                preparedStatement.setLong(15, Long.parseLong(txt14.getText()));
                preparedStatement.setInt(16, Integer.parseInt(txt15.getText()));
                preparedStatement.setString(17, txt16.getText());
                preparedStatement.setString(18, txt17.getText());
                preparedStatement.setString(19, txt18.getText());
                preparedStatement.setString(20, txt19.getText());
                preparedStatement.setString(21, txt20.getText());
                preparedStatement.setString(22, txt21.getText());

                preparedStatement.execute();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println(ex);
            }


        });

        frame.add(menuPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Colibrarian");
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String [] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
