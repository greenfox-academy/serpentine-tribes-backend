package com.greenfox.tribesoflagopus.backend.mockbuilder;

import com.greenfox.tribesoflagopus.backend.model.dto.BuildingDto;
import com.greenfox.tribesoflagopus.backend.model.entity.BuildingType;
import org.springframework.stereotype.Component;

@Component
public class MockUpdatedBuildingDtoBuilder {

  private BuildingDto mockUpdatedBuildingDto;

  public MockUpdatedBuildingDtoBuilder() {
    this.mockUpdatedBuildingDto = BuildingDto.builder()
        .id(2L)
        .type(BuildingType.FARM)
        .level(2)
        .hp(0)
        .build();
  }

  public void setMockBuildingDto(BuildingDto mockBuildingDto) {
    this.mockUpdatedBuildingDto = mockBuildingDto;
  }

  public BuildingDto build() {
    return mockUpdatedBuildingDto;
  }
}
