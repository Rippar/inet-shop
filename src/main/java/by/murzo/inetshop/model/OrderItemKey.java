package by.murzo.inetshop.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class OrderItemKey implements Serializable {

    @Column(name = "orders_id")
    Long orderId;

    @Column(name = "products_id")
    Long productId;
}
