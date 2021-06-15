package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Speciality
import galimsarov.springframework.petclinic.services.SpecialityService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("default", "map")
class SpecialityMapService : AbstractMapService<Speciality>(), SpecialityService