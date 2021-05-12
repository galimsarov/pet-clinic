package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.services.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceMap: AbstractMapService<Owner>(), OwnerService {
    override fun findByLastName(lastName: String): Owner {
        TODO("Not yet implemented")
    }
}