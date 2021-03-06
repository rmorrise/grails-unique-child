package grails.unique.child

class DetailItem {
    static belongsTo = [master: MasterThing]
    String itemName

    static constraints = {
        itemName nullable: false, blank: false, unique: 'master'
    }
}
