package com.example.facade.service.server;

public interface ScheduleServer {
    //method start server
    String startBooting();
    String readSystemConfigFile();
    String init();
    String initializeContext();
    String initializeListeners();
    String createSystemObjects();

    //method stop server
    String releaseProcesses();
    String destroy();
    String destroySystemObjects();
    String destroyListeners();
    String destroyContext();
    String shutdown();
}
