package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.services.OwnerService

class OwnerServiceMap: AbstractMapService<Owner, Long>(), OwnerService {
    override fun findByLastName(lastName: String): Owner {
        TODO("Not yet implemented")
    }

    override fun save(objectToSave: Owner) = super.save(objectToSave.id, objectToSave)
}