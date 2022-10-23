package com.example.facade.service.facade;

import com.example.facade.service.server.ScheduleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerFacadeImpl implements ServerFacade{

    @Autowired
    private final ScheduleServer scheduleServer;

    public ServerFacadeImpl(ScheduleServer scheduleServer) {
        this.scheduleServer = scheduleServer;
    }

    @Override
    public String startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        return "start server successfully!";
    }

    @Override
    public String stopServer() {
        scheduleServer.releaseProcesses();
        scheduleServer.destroy();
        scheduleServer.destroySystemObjects();
        scheduleServer.destroyListeners();
        scheduleServer.destroyContext();
        scheduleServer.shutdown();
        return "stop server successfully!";
    }
}
