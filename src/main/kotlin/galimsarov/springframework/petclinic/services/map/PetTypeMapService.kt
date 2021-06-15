package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.PetType
import galimsarov.springframework.petclinic.services.PetTypeService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("default", "map")
class PetTypeMapService : AbstractMapService<PetType>(), PetTypeService