package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.services.CrudService

class OwnerServiceMap: AbstractMapService<Owner, Long>(), CrudService<Owner, Long> {
    override fun save(objectToSave: Owner) = super.save(objectToSave.id, objectToSave)
}