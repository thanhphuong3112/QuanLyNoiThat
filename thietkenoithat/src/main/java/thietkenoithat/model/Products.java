package thietkenoithat.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "Products")
public class Products {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "ProductID")
    private short prID;
    @Column (name = "ProductName")
    private String prName;
    @Column (name ="Category")
    private String cate;
    @Column(name = "Price")
    private float price;
    @Column (name = "Description")
    private String des;
    public short getPrID() {
        return prID;
    }
    public void setPrID(short prID) {
        this.prID = prID;
    }
    public String getPrName() {
        return prName;
    }
    public void setPrName(String prName) {
        this.prName = prName;
    }
    public String getCate() {
        return cate;
    }
    public void setCate(String cate) {
        this.cate = cate;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    
}
