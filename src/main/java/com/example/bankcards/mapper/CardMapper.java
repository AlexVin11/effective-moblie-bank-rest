package com.example.bankcards.mapper;

import com.example.bankcards.dto.CardDTO.CardCreateDTO;
import com.example.bankcards.dto.CardDTO.CardDTO;
import com.example.bankcards.dto.CardDTO.CardUpdateDTO;
import com.example.bankcards.entity.Card;
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
public abstract class CardMapper {
    public abstract Card map(CardCreateDTO dto);
    public abstract CardCreateDTO map(Card model);
    public abstract Card map(CardDTO dto);
    public abstract void update(CardUpdateDTO dto, @MappingTarget Card model);
}
