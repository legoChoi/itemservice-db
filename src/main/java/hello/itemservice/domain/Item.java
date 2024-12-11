package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table 테이블명 같으면 생략가능
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10) // 컬럼명 같으면 생략가능, 컬럼명은 언더스코어로 자동으로 변환
    private String itemName;
    private Integer price;
    private Integer quantity;

    // JPA는 생성자가 필수
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
