import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GUI implements ActionListener {
    public GUI() {
        JFrame frame = new JFrame();
        frame.setSize(800,100);

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

        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(panel);

        panel.setBorder(BorderFactory.createEmptyBorder(10,50,10,50));
        panel.setLayout(new GridLayout(0,2));
        panel.add(label);
        panel.add(txt);
        panel.add(label1);
        panel.add(txt1);
        panel.add(label2);
        panel.add(txt2);
        panel.add(label3);
        panel.add(txt3);
        panel.add(label4);
        panel.add(txt4);
        panel.add(label5);
        panel.add(txt5);
        panel.add(label6);
        panel.add(txt6);
        panel.add(label7);
        panel.add(txt7);
        panel.add(label8);
        panel.add(txt8);
        panel.add(label9);
        panel.add(txt9);
        panel.add(label10);
        panel.add(txt10);
        panel.add(label11);
        panel.add(txt11);
        panel.add(label12);
        panel.add(txt12);
        panel.add(label13);
        panel.add(txt13);
        panel.add(label14);
        panel.add(txt14);
        panel.add(label15);
        panel.add(txt15);
        panel.add(label16);
        panel.add(txt16);
        panel.add(label17);
        panel.add(txt17);
        panel.add(label18);
        panel.add(txt18);
        panel.add(label19);
        panel.add(txt19);
        panel.add(label20);
        panel.add(txt20);
        panel.add(label21);
        panel.add(txt21);

        JButton button = new JButton("add");
        panel.add(button);

        button.addActionListener(e -> {
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
                preparedStatement.setInt(15, Integer.parseInt(txt14.getText()));
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
                System.out.println(e);
            }


        });

        frame.add(scrollPane, BorderLayout.CENTER);
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
