package com.narayana

class Customer {

    String name
    String city
    String zipcode
    String streetName
    String mainContact
    static hasMany = [contacts: Contact]

    static constraints = {
        name size: 5..40, blank: false
        city size: 5..30, blank: false
        zipcode size: 6..30, blank: false
        streetName size: 5..30, blank: false
        mainContact size: 10..12
    }
}
