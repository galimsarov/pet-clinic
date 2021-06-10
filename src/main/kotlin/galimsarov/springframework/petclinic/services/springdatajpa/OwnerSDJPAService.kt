package galimsarov.springframework.petclinic.services.springdatajpa

import galimsarov.springframework.petclinic.model.Owner
import galimsarov.springframework.petclinic.repositories.OwnerRepository
import galimsarov.springframework.petclinic.repositories.PetRepository
import galimsarov.springframework.petclinic.repositories.PetTypeRepository
import galimsarov.springframework.petclinic.services.OwnerService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdatajpa")
class OwnerSDJPAService(
    private val ownerRepository: OwnerRepository,
    private val petRepository: PetRepository,
    private val petTypeRepository: PetTypeRepository
) : OwnerService {
    override fun findByLastName(lastName: String) = ownerRepository.findByLastName(lastName)

    override fun findAll() = ownerRepository.findAll().toSet()

    override fun findById(id: Long): Owner {
        val optionalOwner = ownerRepository.findById(id)
        return if (optionalOwner.isPresent)
            optionalOwner.get()
        else
            Owner()
    }

    override fun save(objectToSave: Owner) = ownerRepository.save(objectToSave)

    override fun delete(objectToDelete: Owner) = ownerRepository.delete(objectToDelete)

    override fun deleteById(id: Long) = ownerRepository.deleteById(id)
}