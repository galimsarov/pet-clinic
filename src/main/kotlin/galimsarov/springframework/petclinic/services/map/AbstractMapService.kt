package galimsarov.springframework.petclinic.services.map

abstract class AbstractMapService<T, ID> {
    var map = HashMap<ID, T>()
    fun findAll() = map.values.toSet()
    open fun findById(id: ID) = map[id]!!
    fun save(id: ID, objectToSave: T): T {
        map[id] = objectToSave
        return objectToSave!!
    }
    fun deleteById(id: ID) {
        map.remove(id)
    }
    fun delete(objectToDelete: T) {
        map.entries.removeIf { entry -> entry.value?.equals(objectToDelete) ?: false }
    }
}