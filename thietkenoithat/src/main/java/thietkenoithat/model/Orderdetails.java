package thietkenoithat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name="orderdetails")
public class Orderdetails {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "OrderDetailID")
    private short order_ID;
    @Column(name = "OrderID")
    private String orderid;
    public short getOrder_ID() {
        return order_ID;
    }
    public void setOrder_ID(short order_ID) {
        this.order_ID = order_ID;
    }
    public String getOrderid() {
        return orderid;
    }
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    public String getProducID() {
        return producID;
    }
    public void setProducID(String producID) {
        this.producID = producID;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getUnitprice() {
        return unitprice;
    }
    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }
    @Column(name = "ProductID")
    private String producID;
    @Column(name = "Quantity")
    private String quantity;
    @Column(name = "UnitPrice")
    private String unitprice;

}
