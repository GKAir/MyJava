package stack.Mysql;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * Author:  Air
 * Date  :  2017/5/7.
 */
public class MySqlDemo {
    public static void main(String[] args) throws SQLException {
     /*   QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());

        String sql = "INSERT INTO test (cid, name) VALUES (?,?) ";

        for (int i = 1; i <= 10; i++) {
            Object[] params = {i,i};
            qr.update(sql, params);
        }
        sql = "SELECT * FROM test ";*/
        int a = 1;
        for (int i = 0; i < 10; i++) {
            a = i;
            System.out.println(i);
        }

    }
}
