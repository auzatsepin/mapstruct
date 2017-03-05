package mapper.data

import spock.lang.Specification


class StorageSpec extends Specification {

    def creator = new Creator()
    def storage = new Storage()

    def cleanup() {
        storage.clear()
    }

    def "Storage should save persistable class and return not null id"() {
        when:
        def instance = creator.create(Entity.class)
        instance.setMessage("Some message")
        def id = storage.put(instance)
        then:
        assert id != null
    }

    def "Should contain one entity after insert"() {
        when:
        def instance = creator.create(Entity.class)
        instance.setMessage("Some message")
        storage.put(instance)
        then:
        storage.count() == 1
    }
}
