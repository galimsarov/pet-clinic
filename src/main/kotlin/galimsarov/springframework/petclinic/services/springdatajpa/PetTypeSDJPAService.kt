package galimsarov.springframework.petclinic.services.springdatajpa

import galimsarov.springframework.petclinic.model.PetType
import galimsarov.springframework.petclinic.repositories.PetTypeRepository
import galimsarov.springframework.petclinic.services.PetTypeService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdatajpa")
class PetTypeSDJPAService(private val petTypeRepository: PetTypeRepository) : PetTypeService {
    override fun findAll() = petTypeRepository.findAll().toSet()

    override fun findById(id: Long): PetType {
        val optionalPetType = petTypeRepository.findById(id)
        return if (optionalPetType.isPresent)
            optionalPetType.get()
        else
            PetType()
    }

    override fun save(objectToSave: PetType) = petTypeRepository.save(objectToSave)

    override fun delete(objectToDelete: PetType) = petTypeRepository.delete(objectToDelete)

    override fun deleteById(id: Long) = petTypeRepository.deleteById(id)
}