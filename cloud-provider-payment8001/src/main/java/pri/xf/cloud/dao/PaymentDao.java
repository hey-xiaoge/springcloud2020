package pri.xf.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import pri.xf.cloud.entities.Payment;

@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
