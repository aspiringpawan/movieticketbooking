package com.xyz.mapper;

import com.xyz.dto.CityDTO;
import com.xyz.entity.City;

public class CityMapper {

    public static City mapToCity(CityDTO cityDTO) {
        City city = new City();
        city.setName(cityDTO.getName());
        city.setState(cityDTO.getState());
        city.setZipcode(cityDTO.getZipCode());
        return city;
    }

    public static CityDTO mapToCityDTO(City city) {
        CityDTO cityDTO = new CityDTO();
        cityDTO.setName(city.getName());
        cityDTO.setState(city.getState());
        cityDTO.setZipCode(city.getZipcode());
        return cityDTO;
    }
}
