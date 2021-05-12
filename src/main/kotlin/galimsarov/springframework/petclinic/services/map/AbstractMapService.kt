package galimsarov.springframework.petclinic.services.map

import galimsarov.springframework.petclinic.model.BaseEntity
import java.util.*

abstract class AbstractMapService<T: BaseEntity> {
    var map = HashMap<Long, T>()

    fun findAll() = map.values.toSet()

    open fun findById(id: Long) = map[id]!!

    open fun save(objectToSave: T): T {
        if (objectToSave.id == 0L)
            objectToSave.id = getNextId()
        map[objectToSave.id] = objectToSave
        return objectToSave
    }

    fun deleteById(id: Long) {
        map.remove(id)
    }

    fun delete(objectToDelete: T) {
        map.entries.removeIf { entry -> entry.value == objectToDelete }
    }

    private fun getNextId() = try {
            Collections.max(map.keys) + 1
        } catch (e: NoSuchElementException) {
            1
        }
}