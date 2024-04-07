package com.xyz.mapper;

import com.xyz.dto.ShowDTO;
import com.xyz.entity.Show;

public class ShowMapper {

    public static Show mapToShow(ShowDTO showDTO) {
        Show show = new Show();
        show.setShowDate(showDTO.getShowDate());
        show.setMovie(MovieMapper.mapToMovie(showDTO.getMovie()));
        show.setStartTime(showDTO.getStartTime());
        show.setEndTime(showDTO.getEndTime());
        show.setScreen(ScreenMapper.mapToScreen(showDTO.getScreen()));
        return show;
    }

    public static ShowDTO mapToShowDTO(Show show) {
        ShowDTO showDTO = new ShowDTO();
        showDTO.setShowDate(show.getShowDate());
        showDTO.setMovie(MovieMapper.mapToMovieDTO(show.getMovie()));
        showDTO.setScreen(ScreenMapper.mapToScreenDTO(show.getScreen()));
        showDTO.setStartTime(show.getStartTime());
        showDTO.setEndTime(show.getEndTime());
        return showDTO;
    }
}
