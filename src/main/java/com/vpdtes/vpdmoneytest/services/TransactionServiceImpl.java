package com.vpdtes.vpdmoneytest.services;


import com.vpdtes.vpdmoneytest.exception.TransactionException;
import com.vpdtes.vpdmoneytest.model.TransactionRequest;
import com.vpdtes.vpdmoneytest.model.TransactionResponse;
import com.vpdtes.vpdmoneytest.transactionEnum.TransactionStatus;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public TransactionResponse processTransaction(TransactionRequest request) {
        try {
            if (request.getAmount() > 0) {
                return createTransactionResponse(request.getTransactionId(), request.getAmount(), TransactionStatus.SUCCESS, "Transaction processed successfully");
            } else {
                throw new TransactionException("InvalidTransactionAmount", "Transaction amount should be positive");
            }
        } catch (TransactionException e) {

            return createTransactionResponse(request.getTransactionId(), request.getAmount(), TransactionStatus.FAILED, e.getMessage());
        } catch (Exception e) {

            return createTransactionResponse(request.getTransactionId(), request.getAmount(), TransactionStatus.FAILED, "Transaction failed due to an unexpected error");
        }
    }


    private TransactionResponse createTransactionResponse(String transactionId, double amount, TransactionStatus status, String message) {
            TransactionResponse response = new TransactionResponse();
            response.setTransactionId(transactionId);
            response.setAmount(amount);
            response.setStatus(status);
            response.setMessage(message);
            return response;
        }
    }