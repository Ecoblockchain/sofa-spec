
package com.bakkenbaeck.token.model.sofa;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * PaymentStatusChange
 * <p>
 * Notification of status change for Ethereum payment
 * 
 */
public class PaymentStatusChange {

    /**
     * Status
     * <p>
     * New status of Ethereum transaction
     * (Required)
     * 
     */
    @SerializedName("status")
    @Expose
    private String status;
    /**
     * Tx Hash
     * <p>
     * Transaction hash
     * (Required)
     * 
     */
    @SerializedName("txHash")
    @Expose
    private String txHash;
    /**
     * Value
     * <p>
     * Value of transaction
     * (Required)
     * 
     */
    @SerializedName("value")
    @Expose
    private Double value;

    /**
     * Status
     * <p>
     * New status of Ethereum transaction
     * (Required)
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * New status of Ethereum transaction
     * (Required)
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public PaymentStatusChange withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Tx Hash
     * <p>
     * Transaction hash
     * (Required)
     * 
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * Tx Hash
     * <p>
     * Transaction hash
     * (Required)
     * 
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public PaymentStatusChange withTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }

    /**
     * Value
     * <p>
     * Value of transaction
     * (Required)
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Value of transaction
     * (Required)
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

    public PaymentStatusChange withValue(Double value) {
        this.value = value;
        return this;
    }

}