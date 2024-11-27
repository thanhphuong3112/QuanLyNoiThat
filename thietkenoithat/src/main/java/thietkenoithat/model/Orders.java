package thietkenoithat.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name= "Orders")
public class Orders {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column (name= "OrderID")
    private short orderid;
    @Column (name =" OrderDate")
    private Date ordate;
    @Column (name="CustomerID")
    private short cusid;
    @Column(name="TotalAmount")
    private Float total;
    @Column(name="Status")
    private String status;
    public short getOrderid() {
        return orderid;
    }
    public void setOrderid(short orderid) {
        this.orderid = orderid;
    }
    public Date getOrdate() {
        return ordate;
    }
    public void setOrdate(Date ordate) {
        this.ordate = ordate;
    }
    public short getCusid() {
        return cusid;
    }
    public void setCusid(short cusid) {
        this.cusid = cusid;
    }
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
     
}


