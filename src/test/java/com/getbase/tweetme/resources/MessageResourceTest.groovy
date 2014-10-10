package com.getbase.tweetme.resources

/**
 * Created by pawel on 09/10/14.
 */
class MessageResourceTest extends spock.lang.Specification {

    def "should return message of the day"() {
        given: "instance of resource created"
        def resource = new MessageResource();

        expect: "it returns the proper message"
        resource.getMessage() &&
                resource.getMessage() == "Coding in modern Java stack with @getbaselab at #jdd_krakow Cc. @jdd_krakow"
    }
}
