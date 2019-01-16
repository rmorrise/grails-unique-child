package grails.unique.child

class MasterThing {
    static hasMany = [details: DetailItem]

    static constraints = {
    }
}
