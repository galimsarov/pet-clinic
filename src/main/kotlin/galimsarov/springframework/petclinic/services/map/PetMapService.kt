package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Pet
import galimsarov.springframework.petclinic.services.PetService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("default", "map")
class PetMapService : AbstractMapService<Pet>(), PetService