package com.example.chainofresponsibility;

public class RequestWorkFlow {

    public static Approver getApprover() {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();

        supervisor.setNexApprover(manager);
        manager.setNexApprover(director);
        return supervisor;
    }
}
