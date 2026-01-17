import java.sql.*;
public class demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // import pacages
        // load driver
        // register driver
        // create connection
        // create statement
        // execute statemnet
        // close
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname ="postgres";
        String pass="0000";

        //String query="select name from student where s_id =1";
       // String sql = "insert into student values(13,90,'John')";
       // String sql ="update student set name='Max' where s_id=13";
        //  Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");


        Statement st= con.createStatement();
//        boolean status =st.execute(sql);
//        if(!status)
//            System.out.println("Update successfullY");
//        else
//            System.out.println("error");

       //ResultSet rs = st.executeQuery(sql);
//        rs.next(); // true /false
//        System.out.println( rs.getString("name"));
//          while(rs.next()){
//              System.out.print(rs.getInt(1) + "--");
//              System.out.print(rs.getInt(2) + "--");
//              System.out.print(rs.getString(3));
//          }

/// // preparered statement
        String sql ="insert into student values(?,?,?)";
        int id= 91;
        int marks=90;
        String name ="irsi";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,id);
        pst.setInt(2,marks);
        pst.setString(3,name);

        pst.execute();
        con.close();


    }
}
