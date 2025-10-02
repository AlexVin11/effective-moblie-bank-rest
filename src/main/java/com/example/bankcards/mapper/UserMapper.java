package com.example.bankcards.mapper;

import com.example.bankcards.dto.UserDTO.UserCreateDTO;
import com.example.bankcards.dto.UserDTO.UserDTO;
import com.example.bankcards.dto.UserDTO.UserUpdateDTO;
import com.example.bankcards.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        uses = {JsonNullableMapper.class, ReferenceMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class UserMapper {
    public abstract User map(UserCreateDTO dto);
    public abstract UserDTO map(User model);
    public abstract User map(UserDTO dto);
    public abstract void update(UserUpdateDTO dto, @MappingTarget User model);
}
