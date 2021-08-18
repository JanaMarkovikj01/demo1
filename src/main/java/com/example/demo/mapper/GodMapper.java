package com.example.demo.mapper;

import com.example.demo.God;
import com.example.demo.GodDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper //(componentModel = "spring")
public interface GodMapper {
    GodMapper MAPPER = Mappers.getMapper(GodMapper.class);

    @Mapping(source="name", target = "ime")
    GodDto toGodDto(God god);
}
