package grails.rest.api.example
import grails.rest.Resource

@Resource(uri='/api/models', formats=['json', 'xml'])
class Model {
    String name

    static belongsTo = [ make: Make ]

    static constraints = {
    }

    String toString() {
        name
    }
}
