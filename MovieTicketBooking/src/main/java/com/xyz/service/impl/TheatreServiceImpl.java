package com.xyz.service.impl;

import com.xyz.dto.TheatreDTO;
import com.xyz.entity.Theatre;
import com.xyz.mapper.TheatreMapper;
import com.xyz.repository.TheatreRepository;
import com.xyz.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    /**
     * @param theatreDTO
     */
    @Override
    public void add(TheatreDTO theatreDTO) {
        theatreRepository.save(TheatreMapper.mapToTheatre(theatreDTO));
    }

    /**
     * @return
     */
    @Override
    public List<TheatreDTO> getAllTheatres() {
        List<TheatreDTO> theatreDTOList = theatreRepository.findAll().stream().map(TheatreMapper::mapToTheatreDTO).toList();
        return theatreDTOList;
    }

    /**
     * @param name
     * @return
     */
    @Override
    public TheatreDTO getTheatreByName(String name) {
        Theatre theatre = theatreRepository.getTheatreByName(name);
        return TheatreMapper.mapToTheatreDTO(theatre);
    }
}
