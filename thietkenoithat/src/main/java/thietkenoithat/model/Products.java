package thietkenoithat.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name= "Products")
public class Products {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column (name= "ProductID")
    private short prid;
    @Column(name = "ProductName")
    private String prname;
    @Column (name = "Category")
    private String cate;
    @Column (name = "Price")
    private float price;
    @Column (name = "Description")
    private String des;
    public short getPrid() {
        return prid;
    }
    public void setPrid(short prid) {
        this.prid = prid;
    }
    public String getPrname() {
        return prname;
    }
    public void setPrname(String prname) {
        this.prname = prname;
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
