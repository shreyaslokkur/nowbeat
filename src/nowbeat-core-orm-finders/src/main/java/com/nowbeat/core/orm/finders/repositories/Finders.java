package com.nowbeat.core.orm.finders.repositories;


import com.nowbeat.core.IEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.math.BigDecimal;

public class Finders {


    @Autowired
    public AddressRepository addressRepository;

    @Autowired
    public AreaRepository areaRepository;

    @Autowired
    public CountryRepository countryRepository;

    @Autowired
    public CityRepository cityRepository;

    @Autowired
    public ClubRatingRepository clubRatingRepository;






}
