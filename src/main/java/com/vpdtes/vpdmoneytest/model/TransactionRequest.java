package com.vpdtes.vpdmoneytest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="TRANSACTION-REQUEST")
@Getter
@Setter
@NoArgsConstructor
public class TransactionRequest {

    private String transactionId;
    private double amount;
    private String senderAccount;
    private String receiverAccount;
    private String currency;
    private Date timestamp;

    public double getAmount() {
        return 0;
    }

    public String getTransactionId() {
        return null;
    }
//
//    public double getAmount() {
//    }
}
