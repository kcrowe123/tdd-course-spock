import spock.lang.Specification
import tdd.example.spock.tddcoursespock.ValidateISBN

class ValidateISBNSpec extends Specification {

    def "Check a valid ISBN"() {
        given:
        def validator = new ValidateISBN()

        when:
        def result = validator.checkISBN(140449116)

        then:
        true == result
    }
}
