package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Speciality
import galimsarov.springframework.petclinic.services.SpecialitiesService
import org.springframework.stereotype.Service

@Service
class SpecialityServiceMap: AbstractServiceMap<Speciality>(), SpecialitiesService