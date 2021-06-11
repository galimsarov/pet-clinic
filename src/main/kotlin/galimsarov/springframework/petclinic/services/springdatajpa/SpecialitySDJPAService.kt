package galimsarov.springframework.petclinic.services.springdatajpa

import galimsarov.springframework.petclinic.model.Speciality
import galimsarov.springframework.petclinic.repositories.SpecialityRepository
import galimsarov.springframework.petclinic.services.SpecialityService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdatajpa")
class SpecialitySDJPAService(private val specialityRepository: SpecialityRepository) : SpecialityService {
    override fun findAll() = specialityRepository.findAll().toSet()

    override fun findById(id: Long): Speciality {
        val optionalSpeciality = specialityRepository.findById(id)
        return if (optionalSpeciality.isPresent)
            optionalSpeciality.get()
        else
            Speciality()
    }

    override fun save(objectToSave: Speciality) = specialityRepository.save(objectToSave)

    override fun delete(objectToDelete: Speciality) = specialityRepository.delete(objectToDelete)

    override fun deleteById(id: Long) = specialityRepository.deleteById(id)
}