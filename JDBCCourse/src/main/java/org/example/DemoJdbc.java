package org.example;
import java.sql.*;

public class DemoJdbc {

    public static void main(String[] args) throws Exception {

        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
         */

        int sid = 101;
        String name = "Anvesha";
        int marks = 23;

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String username = "postgres";
        String password = "aryan123";
        String sql = "insert into student values(?,?,?)";

        Class.forName("org.postgresql.Driver");   //Load and Register

        //create connection

        Connection con = DriverManager.getConnection(
                url, username, password
        );
        System.out.println("Connected to PostgreSQL database");

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1,sid);
        ps.setString(2,name);
        ps.setInt(3,marks);

        ps.execute();






        //CRUD OPERATIONS
    /*
        String query = "select * from student";
        String query2 = "insert into student values(1,'Aryan', 90)";
        String query3 = "update student set name = 'Aaryan' where sid = 1";
        String query4 = "delete from student where sid = 4";

        //create, execute and process statement
        Statement stmt = con.createStatement();


          //Read the data from the Database


//        ResultSet rs = stmt.executeQuery(query);
//
////        rs.next();
////        int id = rs.getInt(1);
////        String name = rs.getString("name");
////        int marks = rs.getInt("marks");
////        System.out.println(id + " " + name + " " + marks);
//
//        while (rs.next()) {
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.println(rs.getString(3));
//        }

        //Write Data in database

//        boolean status =  stmt.execute(query2);
//        System.out.println("Executed query: " + status);

        //Update Data in database
//        stmt.execute(query3);

        //Delete Data from database
        stmt.execute(query2);

     */


        //close
        con.close();
        System.out.println("Closed connection");




    }



}
