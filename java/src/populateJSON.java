import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class populateJSON {
    public static void main(String [] args){
        populateJSON.saveToJSON();
    }

    public static void saveToJSON(){
        String url = "jdbc:mysql://localhost:3306/mysql";
        String sql = "SELECT * FROM colibrariandb.Books";

        try{
            //initialization of SQL connection and SQL query
            Connection conn = DriverManager.getConnection(url, "root", "k4@@xCP/pLyM&\\m");
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            ResultSetMetaData rsmd = res.getMetaData();
            int colNum = rsmd.getColumnCount();
            List<Map<String, String>> books = new ArrayList<>();

            //books from Books table added to HashMap
            while(res.next()){
                Map<String, String> row = new HashMap<>();
                for(int i = 1; i <= colNum; i++){
                    row.put(rsmd.getColumnName(i), res.getString(i));
                }
                books.add(row);
            }
            conn.close();

            //books HashMap converted to JSON and written to JSON file
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(books);

            try (FileWriter file = new FileWriter("books.json")) {
                file.write(json);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }
}
