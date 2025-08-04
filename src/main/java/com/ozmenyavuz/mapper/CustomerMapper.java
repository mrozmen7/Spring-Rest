package com.ozmenyavuz.mapper;


import com.ozmenyavuz.dto.CustomerDto;
import com.ozmenyavuz.dto.CustomerIU;
import com.ozmenyavuz.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toDto(CustomerEntity entity);
    CustomerEntity toEntity(CustomerIU dto);


}
