package grails.rest.api.example

import grails.gorm.services.Service

@Service(Model)
interface ModelService {
    Model save(String name, Make make)
}