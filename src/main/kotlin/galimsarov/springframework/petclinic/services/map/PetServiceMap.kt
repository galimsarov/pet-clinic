package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Pet
import galimsarov.springframework.petclinic.services.CrudService

class PetServiceMap: AbstractMapService<Pet, Long>(), CrudService<Pet, Long> {
    override fun save(objectToSave: Pet) = super.save(objectToSave.id, objectToSave)
}