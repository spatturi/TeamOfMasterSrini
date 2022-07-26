import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class FileToDb {
    public void filetoDbMethod(){
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("C:\\My_Work_Space\\TeamOfMasterSrini\\EmpData.txt"));
            String line;

            //Driver class load
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Dhruva@2012");
            System.out.println("conn:"+conn);

            PreparedStatement pstmt1 = conn.prepareStatement("select * from employee");
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("emp_id")+"--"+rs.getString("emp_name")+"--"+
                        rs.getString("emp_salary")+"--"+rs.getString("emp_dob"));

            }

            ResultSetMetaData rsm = pstmt1.getMetaData();
            String[] employee = new String[rsm.getColumnCount()];
            PreparedStatement pstmt2 = conn.prepareStatement("insert into employee values(?,?,?,?)");

            while ((line= br.readLine()) !=null){
 //               System.out.println(line);
                int i=0;
                for (String s:line.split(",")){
                    employee[i]=s;
                    i++;
                }
                pstmt2.setInt(1,Integer.parseInt(employee[0]));
                pstmt2.setString(2,employee[1]);
                pstmt2.setDouble(3,Double.parseDouble(employee[2]));
                pstmt2.setDate(4,Date.valueOf(employee[3]));
                pstmt2.addBatch();
            }
            pstmt2.executeBatch();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
