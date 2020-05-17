package pri.xf.cloud.service;

import org.apache.ibatis.annotations.Param;
import pri.xf.cloud.entities.Payment;

/**
 * @Author: X
 * @Date: 2020/5/17
 * @Description:
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
