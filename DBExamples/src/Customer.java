import java.sql.*;
import java.util.Scanner;

public class Customer {

    public static void selectMethod(Statement stm) throws SQLException {
        //Create Statement
        //Statement stm = conn.createStatement();
        //select query
        String s1 = "select * from customer";
        ResultSet rs=stm.executeQuery(s1);
        System.out.println("select s1:"+s1);
        while (rs.next()){
            System.out.println(rs.getString("cust_id")+"--"+rs.getString("cust_name")
                    +"--"+rs.getString("cust_contact"));
        }
    }
    public static void main(String[] args) {

        try {
            //Driver class load
            Class.forName("com.mysql.cj.jdbc.Driver");
            //getConnection using DriverManager
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Dhruva@2012");
            //Create Statement
             Statement stm = conn.createStatement();

            //execute query
            selectMethod(stm);

            Scanner sc = new Scanner(System.in);
            System.out.println("Please input Customer_Id:");
            int cust_id=sc.nextInt();
            System.out.println("Customer_name:");
            String cust_name=sc.next();
            System.out.println("Customer Contact Number:");
            String cust_number=sc.next();

            //insert query
            String s2 = "insert into customer values("+cust_id+",'"+cust_name+"','"+cust_number+"')";
            System.out.println("Insert String S2:"+s2);

            int c1=stm.executeUpdate(s2);

            System.out.println("Select method after insert");
            selectMethod(stm);

            //update query
            System.out.println("Customer updated Name:");
            String cust_UpdateName = sc.next();
//            String cust_UpdateName = sc.nextLine();
            String s3 = "update customer set cust_name='"+cust_UpdateName+"' where cust_id="+cust_id;
            System.out.println("update query S3:"+s3);
            int c2 = stm.executeUpdate(s3);
            System.out.println("Select method after update");
            selectMethod(stm);
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
