package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Speciality
import galimsarov.springframework.petclinic.services.SpecialityService
import org.springframework.stereotype.Service

@Service
class SpecialityMapService : AbstractMapService<Speciality>(), SpecialityService