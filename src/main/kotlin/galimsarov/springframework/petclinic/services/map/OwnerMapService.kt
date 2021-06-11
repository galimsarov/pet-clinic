package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.services.OwnerService
import galimsarov.springframework.petclinic.services.PetService
import galimsarov.springframework.petclinic.services.PetTypeService
import org.springframework.stereotype.Service

@Service
class OwnerMapService(
    private val petTypeService: PetTypeService,
    private val petService: PetService
) : AbstractMapService<Owner>(), OwnerService {
    override fun save(objectToSave: Owner): Owner {
        if (objectToSave.pets.isNotEmpty()) {
            objectToSave.pets.forEach { pet ->
                if (pet.petType.id == 0L) {
                    pet.petType = petTypeService.save(pet.petType)
                }
                if (pet.id == 0L) {
                    val savedPet = petService.save(pet)
                    pet.id = savedPet.id
                }
            }
        }

        return super.save(objectToSave)
    }

    override fun findByLastName(lastName: String): Owner {
        TODO("Not yet implemented")
    }
}