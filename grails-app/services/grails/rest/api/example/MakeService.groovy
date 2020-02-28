package grails.rest.api.example

import grails.gorm.services.Service

@Service(Make)
interface MakeService {
    Make save(String name)
}