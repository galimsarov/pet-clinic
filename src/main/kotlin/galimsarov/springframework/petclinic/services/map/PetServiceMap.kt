package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Pet
import galimsarov.springframework.petclinic.services.PetService

class PetServiceMap: AbstractMapService<Pet, Long>(), PetService {
    override fun save(objectToSave: Pet) = super.save(objectToSave.id, objectToSave)
}