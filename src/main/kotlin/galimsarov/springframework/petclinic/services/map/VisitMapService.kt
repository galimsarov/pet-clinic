package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.Visit
import galimsarov.springframework.petclinic.services.VisitService
import org.springframework.stereotype.Service

@Service
class VisitMapService : AbstractMapService<Visit>(), VisitService