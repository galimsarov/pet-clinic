package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Visit
import galimsarov.springframework.petclinic.services.VisitService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("default", "map")
class VisitMapService : AbstractMapService<Visit>(), VisitService