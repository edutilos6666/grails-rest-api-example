package grails.rest.api.example


import grails.rest.Resource

@Resource(uri='/api/vehicles', formats=['json', 'xml'])
@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {

    Integer year

    String name
    Model model
    Make make

    static constraints = {
        year min: 1900
        name maxSize: 255
    }
}
