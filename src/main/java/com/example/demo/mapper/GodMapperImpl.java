package com.example.demo.mapper;

import com.example.demo.God;
import com.example.demo.GodDto;

public class GodMapperImpl implements GodMapper {
    public GodMapperImpl() {
    }

    @Override
    public GodDto toGodDto(God god) {
        if (god == null) {
            return null;
        } else {

            GodDto godDto = new GodDto();
            godDto.setIme(god.getName());
            godDto.setHeight(god.getHeight());
            godDto.setMother(god.getMother());
            godDto.setFather(god.getFather());
            return godDto;

        }
    }
}
