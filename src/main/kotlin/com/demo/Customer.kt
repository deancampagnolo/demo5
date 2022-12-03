package com.demo

import jakarta.persistence.*

@Entity
class Customer constructor() {

    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private var id: Int = -1
    private var name: String = ""
    private var email: String = ""
    private var age: Int = -1

    constructor(id: Int, name: String, email: String, age: Int) : this() {
        this.id = id
        this.name = name
        this.email = email
        this.age = age
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Customer

        if (id != other.id) return false
        if (name != other.name) return false
        if (email != other.email) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + email.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "Customer(id=$id, name='$name', email='$email', age=$age)"
    }

}