package kr.re.kitri.service;

import kr.re.kitri.model.Order;
import kr.re.kitri.util.OrderConstants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static kr.re.kitri.util.OrderConstants.DB_URL;
import static kr.re.kitri.util.OrderConstants.PASSWORD;
import static kr.re.kitri.util.OrderConstants.USERNAME;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderService {

    String query ="select customer.cust_id, customer.username, customer.address, " +
            "customer.email, orders.order_date, orders.prod_name from customer, " +
            "orders where customer.cust_id = orders.cust_id";

    //Driver loading
    public OrderService() {
        try {
            Class.forName(OrderConstants.DRIVER_POSTGRES);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("driver ok");
    }

    public List<Order> getOrderList() {
        List<Order> newList = new ArrayList<Order>();
        try {
            Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD );
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                newList.add(new Order((rs.getInt(1)), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6)));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return newList;
    }
}
