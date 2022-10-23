package com.example.facade.controller;

import com.example.facade.service.facade.ServerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/facade")
public class ScheduleServerController {

    @Autowired
    private final ServerFacade serverFacade;

    public ScheduleServerController(ServerFacade serverFacade) {
        this.serverFacade = serverFacade;
    }

    @GetMapping(value = "/start-server")
    public ResponseEntity<String> startServer() {
        return ResponseEntity.ok().body(serverFacade.startServer());
    }

    @GetMapping(value = "/stop-server")
    public ResponseEntity<String> stopServer() {
        return ResponseEntity.ok().body(serverFacade.stopServer());
    }
}
