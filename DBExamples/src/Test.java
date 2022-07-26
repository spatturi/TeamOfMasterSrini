import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class loaded successfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Dhruva@2012");
            System.out.println("Connection"+con);

            Statement stm = con.createStatement();

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter id : ");
            int id = sc.nextInt();
            System.out.println("Enter name : ");
            String name = sc.next();
            System.out.println("Enter sal : ");
            double sal = sc.nextDouble();

            String str = "2022-07-09";
            Date date = Date.valueOf(str);
            System.out.println("date:"+date);
   //         Date date = 2022-07-09;
 //           String s1 = "insert into employee values(105,'Aditri',1000,'2022-07-09')";
            //insert query
            String s1 = "insert into employee values("+id+",'"+name+"',"+sal+",'"+date+"')";
            System.out.println(s1);

            int count = stm.executeUpdate(s1);

            if (count>0)
                System.out.println(count+"Record/Records inserted");
            else
                System.out.println("Record not inserted");

            //Update query
            int id2 = 105;
            String s2 = "update employee set emp_name='Aditri Patturi' where emp_id="+id2;

            int count1 = stm.executeUpdate(s2);

            if (count1>0)
                System.out.println(count1+"Record/Records updated");
            else
                System.out.println("Record not updated");

            //delete query
            String s3 = "delete from employee where emp_id="+id;

            int count2 = stm.executeUpdate(s3);
            if (count2>0)
                System.out.println(count2+"Record deleted");
            else
                System.out.println("Record not deleted");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
