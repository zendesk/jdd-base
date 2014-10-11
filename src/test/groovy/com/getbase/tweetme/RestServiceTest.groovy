package com.getbase.tweetme

import groovyx.net.http.RESTClient
import spock.lang.Specification

/**
 * Created by pawel on 11/10/14.
 */
class RestServiceTest extends Specification {
    def "'/message' should return 200 and the message of the day"() {
        given: "application is running"
        new TweetMeApplication().run(["server"] as String[]);
        def endpoint = new RESTClient('http://localhost:8080/')

        when: "message resource is accessed"
        def response = endpoint.get([path: 'message'])

        then: "it returns 200 and proper message"
        with (response) {
            status == 200
            data.text == "Coding in modern Java stack with @getbaselab at #jdd_krakow Cc. @jdd_krakow"
        }
    }
}
