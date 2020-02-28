package grails.rest.api.example


import grails.rest.Resource

@Resource(uri='/api/makes', formats=['json', 'xml'])
class Make {
    String name

    static constraints = {
    }

    String toString() {
        name
    }
}
