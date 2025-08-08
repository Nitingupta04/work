public class Jtc1 {
    static{
    Connection con=null;
    Statement st=null;
    try{
    //step 1:Load the drive class.
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    //step2. Establish the Connection.
    con=DriverManager.getConnection("jdbc:odbc:JTCORADSN",
    "root","root");
    // step 3: Prepare the SQL Statement.
    String sql="insert into jtcstudents";
    values(99,'som','som@jtc.com','123345567'";
    // Step 4: Create the JDBC Statement.
    st=con.createStatement();
    //Step 5: Submit the SQL Statement to Database using JDBC
    Statement.
    int x=st.executeUpdate(sql);
    // Step 6:Process the result.
    if(x==1){
    System.out.println("Record inserted");
    }else{
    System.out.println("Record Not Inserted");
    }
    }catch(Exception e){
    e.printStackTrace();
    }finally{
    // Step 7:Close all the resources.
    try{
    if(st!=null) st.close();
    if(con!=null) con.close();
    }catch(Exception e){
    e.printStackTrace();
}
}
}
}
    