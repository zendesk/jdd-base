package com.getbase.tweetme.resources

/**
 * Created by pawel on 09/10/14.
 */
class MessageResourceTest extends spock.lang.Specification {

    def "should return message of the day"() {
        given: "instance of resource created"
        def resource = new MessageResource();

        expect: "it returns non-empty message of the day"
        resource.getMessage() && resource.getMessage().trim()
    }
}
