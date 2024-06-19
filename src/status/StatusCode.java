/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *This class declares an enum of StatusCode and getters and setters
 * @author jassk
 */

public enum StatusCode {
    ZERO("REJECTED"),
    ONE("PENDING"),
    TWO("PROCESSING"),
    THREE("APPROVED");

    private final String status;

    StatusCode(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}

