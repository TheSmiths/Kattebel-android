package com.wearesmiths.kattebel.Models;

public class SyncCode {

    private String syncCode;
    private String expiresAt;

    /**
     * Get the sync code
     * @return The syncCode
     */
    public String getSyncCode() {
        return syncCode;
    }

    /**
     * Set the sync code
     * @param syncCode The syncCode
     */
    public void setSyncCode(String syncCode) {
        this.syncCode = syncCode;
    }

    /**
     * Get the expiration time for this sync code
     * @return The expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Set the expiration time for this sync code
     * @param expiresAt The expiresAt
     */
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

}
