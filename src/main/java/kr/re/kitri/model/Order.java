package kr.re.kitri.model;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class Order {
    private int cust_id;
    private String username;
    private String address;
    private String email;
    private String order_date;
    private String prod_name;



    public Order(int cust_id, String username, String address, String email,
                 String order_date, String prod_name) {
        this.cust_id = cust_id;
        this.username = username;
        this.address = address;
        this.email = email;
        this.order_date = order_date;
        this.prod_name = prod_name;

    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getorder_Date() {
        return order_date;
    }

    public void setorder_Date(String date) {
        this.order_date = order_date;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cust_id=" + cust_id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", order_date='" + order_date + '\'' +
                ", prod_name='" + prod_name + '\'' +
                '}';
    }
}
