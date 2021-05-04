package galimsarov.springframework.petclinic.services

interface CrudService<T, ID> {
    fun findAll(): Set<T>
    fun findById(id: ID): T
    fun save(objectToSave: T): T
    fun delete(objectToDelete: T)
    fun deleteById(id: ID)
}