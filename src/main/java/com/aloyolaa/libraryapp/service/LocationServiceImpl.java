package com.aloyolaa.libraryapp.service;

import com.aloyolaa.libraryapp.entity.Location;
import com.aloyolaa.libraryapp.repository.BaseRepository;
import com.aloyolaa.libraryapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl extends BaseServiceImpl<Location, Long> implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public LocationServiceImpl(BaseRepository<Location, Long> baseRepository) {
        super(baseRepository);
    }
}
