package com.springcloud.hr_payroll.services;


import com.springcloud.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("wagner", 200.0, days);
    }
}
