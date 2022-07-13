import java.sql.*;
import java.util.Scanner;

public class TableData {

    public String getTableName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input Table Name:");
        return sc.next();
    }

    public void getTableData(String tableName){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Dhruva@2012");
//            System.out.println("tableName:"+tableName);
            String query = "select * from $table_Name".replace("$table_Name",tableName);
            System.out.println("query:"+query);
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsm  = pstmt.getMetaData();
            System.out.println("Table Name:"+rsm.getTableName(1));
            System.out.println("================================");
            //table column names print
            for (int i=1; i<=rsm.getColumnCount();i++){
                System.out.print(rsm.getColumnLabel(i)+" ");
            }
            System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                System.out.print(rs.getString(i)+"    ");
            }
            System.out.println();
          }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        }

}
