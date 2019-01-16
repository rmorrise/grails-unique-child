package grails.unique.child

import grails.rest.RestfulController

class MasterThingController extends RestfulController<MasterThing> {
	static responseFormats = ['json']
	
    MasterThingController() {
        super(MasterThing)
    }
}
