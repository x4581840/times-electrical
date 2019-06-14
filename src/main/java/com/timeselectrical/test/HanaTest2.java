package com.timeselectrical.test;

import java.sql.*;
/**
 * @Description
 * @Author longjianyong
 * @Date 2019-06-13 13:45
 * @Version 1.0
 **/

public class HanaTest2 {

    private static final String DRIVER = "com.sap.db.jdbc.Driver";
    private static final String URL = "jdbc:sap://172.23.1.123:39015?reconnect=true";

    public static void main(String[] args) {
        HanaTest2 demo = new HanaTest2();
        try {
            demo.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void select() throws Exception {
        Connection con = this.getConnection(DRIVER, URL, "SYSTEM","Ankki@2009");
        PreparedStatement pstmt = con.prepareStatement("select USER_ID,USER_NAME,USER_MODE from SYS.USERS");
        ResultSet rs = pstmt.executeQuery();
        this.processResult(rs);
        this.closeConnection(con, pstmt);

    }

    private void processResult(ResultSet rs) throws Exception {
        if (rs.next()) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int colNum = rsmd.getColumnCount();
            for (int i = 1; i <= colNum; i++) {
                if (i == 1) {
                    System.out.print(rsmd.getColumnName(i));
                } else {
                    System.out.print("\t" + rsmd.getColumnName(i));
                }

            }
            System.out.print("\n");
            System.out.println("———————–");
            do {
                for (int i = 1; i <= colNum; i++) {
                    if (i == 1) {
                        System.out.print(rs.getString(i));
                    } else {
                        System.out.print("\t"
                                + (rs.getString(i) == null ? "null" : rs
                                .getString(i).trim()));
                    }

                }
                System.out.print("\n");
            } while (rs.next());
        } else {
            System.out.println("query not result.");
        }

    }

    private Connection getConnection(String driver, String url, String user,
                                     String password) throws Exception {
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);

    }

    private void closeConnection(Connection con, Statement stmt)
            throws Exception {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }
    }
}
