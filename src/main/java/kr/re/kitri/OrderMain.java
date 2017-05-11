package kr.re.kitri;

import kr.re.kitri.model.Order;
import kr.re.kitri.service.OrderService;

import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderMain {
    public static void main(String[] args) {

        //드라이버 로딩은 OrderService 생성자에 포함 시키면 됨.
        OrderService service = new OrderService();

        List<Order> list = service.getOrderList();

        for(Order e : list) {
            System.out.printf(e+"\n");
        }
    }


}
