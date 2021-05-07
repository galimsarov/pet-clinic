package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.services.CrudService

class VetServiceMap: AbstractMapService<Vet, Long>(), CrudService<Vet, Long> {
    override fun save(objectToSave: Vet) = super.save(objectToSave.id, objectToSave)
}