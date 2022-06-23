package designpattern.singleton;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class SingletonPatternTest {

    static Connection getDBConnection() {
        Connection con = null;

        SingletonPatternEx se = SingletonPatternEx.getInstance();

        try {
            con = DriverManager.getConnection(se.getUrl(), se.getId(), se.getPw());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    static Set<Integer> getSet() {
        CallableStatement cs = null;
        ResultSet rs = null;

        Set<Integer> set = new HashSet<>();
        try {
            cs = getDBConnection().prepareCall("SELECT NO FROM BOARD");
            cs.execute();
            rs = cs.getResultSet();
            while(rs.next()) {
                set.add(rs.getInt("NO"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(cs != null) cs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = getSet();

        if(set.isEmpty()) {
            System.out.println("데이터 없음.");
            return;
        }

        for(int n : set) {
            System.out.println("no : " + n + " ");
        }

        System.out.printf("데이터 총 %s개", set.size());
    }
}
