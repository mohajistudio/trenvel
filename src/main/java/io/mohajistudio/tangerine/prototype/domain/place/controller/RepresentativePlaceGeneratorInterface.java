package io.mohajistudio.tangerine.prototype.domain.place.controller;

import io.mohajistudio.tangerine.prototype.infra.place.dto.AddressDTO;

import java.util.List;

public interface RepresentativePlaceGeneratorInterface {
    List<String> generate(List<AddressDTO> places);
}
