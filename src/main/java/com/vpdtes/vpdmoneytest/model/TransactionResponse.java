package com.vpdtes.vpdmoneytest.model;

import com.vpdtes.vpdmoneytest.transactionEnum.TransactionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="TRANSACTION-RESPONSE")
@Getter
@Setter
@NoArgsConstructor
public class TransactionResponse {

    private String transactionId;
    private double amount;
    private TransactionStatus status;
    private String message;

    public void setTransactionId(String transactionId) {
    }

    public void setAmount(double amount) {
    }

    public void setStatus(TransactionStatus status) {
    }

    public void setMessage(String message) {
    }
}
