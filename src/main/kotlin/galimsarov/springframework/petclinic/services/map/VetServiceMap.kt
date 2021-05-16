package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Vet
import galimsarov.springframework.petclinic.services.SpecialityService
import galimsarov.springframework.petclinic.services.VetService
import org.springframework.stereotype.Service

@Service
class VetServiceMap(private val specialityService: SpecialityService): AbstractServiceMap<Vet>(), VetService {
    override fun save(objectToSave: Vet): Vet {
        if (objectToSave.specialities.size > 0) {
            objectToSave.specialities.forEach { speciality ->
                if (speciality.id == 0L) {
                    val savedSpeciality = specialityService.save(speciality)
                    speciality.id = savedSpeciality.id
                }
            }
        }
        return super.save(objectToSave)
    }
}