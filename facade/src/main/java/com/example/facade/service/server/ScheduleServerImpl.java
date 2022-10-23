package com.example.facade.service.server;

import org.springframework.stereotype.Service;

@Service
public class ScheduleServerImpl implements ScheduleServer{
    @Override
    public String startBooting() {
        return "start booting successfully!";
    }

    @Override
    public String readSystemConfigFile() {
        return "read system config file successfully!";
    }

    @Override
    public String init() {
        return "init successfully!";
    }

    @Override
    public String initializeContext() {
        return "initialize context successfully!";
    }

    @Override
    public String initializeListeners() {
        return "initialize listeners successfully!";
    }

    @Override
    public String createSystemObjects() {
        return "create system objects successfully!";
    }

    @Override
    public String releaseProcesses() {
        return "release processes successfully!";
    }

    @Override
    public String destroy() {
        return "destroy successfully!";
    }

    @Override
    public String destroySystemObjects() {
        return "destroy system object successfully!";
    }

    @Override
    public String destroyListeners() {
        return "destroy listeners successfully!";
    }

    @Override
    public String destroyContext() {
        return "destroy context successfully!";
    }

    @Override
    public String shutdown() {
        return "shutdown server successfully!";
    }
}
