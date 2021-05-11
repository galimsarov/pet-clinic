package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.services.VetService

class VetServiceMap: AbstractMapService<Vet, Long>(), VetService {
    override fun save(objectToSave: Vet) = super.save(objectToSave.id, objectToSave)
}