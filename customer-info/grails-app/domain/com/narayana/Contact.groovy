package com.narayana

class Contact {

    static belongsTo = [customer: Customer]
    String officeNumber
    String alternativeNumber

    static constraints = {
        officeNumber size: 10..12
        alternativeNumber size: 10..12
    }
}
