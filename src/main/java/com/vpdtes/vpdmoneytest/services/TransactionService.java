package com.vpdtes.vpdmoneytest.services;


import com.vpdtes.vpdmoneytest.model.TransactionRequest;
import com.vpdtes.vpdmoneytest.model.TransactionResponse;

public interface TransactionService {
    TransactionResponse processTransaction(TransactionRequest request);
}