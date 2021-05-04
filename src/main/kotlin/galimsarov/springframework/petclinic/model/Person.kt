package galimsarov.springframework.petclinic.model

open class Person: BaseEntity() {
    private lateinit var firstName: String
    private lateinit var lastName: String
}