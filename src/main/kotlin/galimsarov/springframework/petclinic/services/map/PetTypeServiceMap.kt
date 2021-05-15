package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.PetType
import galimsarov.springframework.petclinic.services.PetTypeService
import org.springframework.stereotype.Service

@Service
class PetTypeServiceMap: AbstractMapService<PetType>(), PetTypeService