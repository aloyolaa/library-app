package com.aloyolaa.libraryapp.controller;

import com.aloyolaa.libraryapp.entity.Location;
import com.aloyolaa.libraryapp.service.LocationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/locations")
@CrossOrigin(origins = "*")
public class LocationController extends BaseControllerImpl<Location, LocationService> {
    public LocationController(LocationService service) {
        super(service);
    }
}
