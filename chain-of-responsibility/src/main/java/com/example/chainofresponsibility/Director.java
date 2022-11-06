package com.example.chainofresponsibility;

public class Director extends Approver {
    @Override
    public boolean canApprove(Long days) {
        return days > 7;
    }

    @Override
    public void approving(Request request) {
        System.out.println("Request was approved for " + request.getDay() + " days by Director");
    }
}
