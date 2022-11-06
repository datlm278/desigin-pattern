package com.example.chainofresponsibility;

import lombok.Data;

@Data
public abstract class Approver {

    protected Approver nexApprover;

    public void approveRequest(Request request) {
        System.out.println("Checking permission for " + this.getClass().getSimpleName());

        if (this.canApprove(request.getDay()))
            this.approving(request);
        else if (nexApprover != null)
            nexApprover.approveRequest(request);
    }

    public abstract boolean canApprove(Long days);

    public abstract void approving(Request request);

}
