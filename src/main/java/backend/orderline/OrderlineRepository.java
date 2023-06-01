package backend.orderline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderlineRepository extends JpaRepository<Orderline, Long> {

    List<Orderline> findOrderlinesByUserId(Long id);

//    @Modifying
//    @Query("UPDATE Orderline o SET o.amount = :amount, o.totalPrice = :totalPrice WHERE o.id = :orderlineId")
//    public void updateAmountAndTotalPriceById(Long orderlineId, float totalPrice, Long amount);
}
