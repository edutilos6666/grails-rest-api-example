package grails.rest.api.example


import grails.rest.*
import grails.converters.*

class HomeController {
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
