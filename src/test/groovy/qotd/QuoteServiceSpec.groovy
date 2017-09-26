package qotd

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class QuoteServiceSpec extends Specification implements ServiceUnitTest<QuoteService>{
  def quoteService
    
    void "static quote service always returns quiche quote" (){

      when:
        Quote staticQuote = quoteService.getStaticQuote()

      then:
        staticQuote.author == "Anonymous"
        staticQuote.content == "Real Programmers Don't eat much quicheQuiche"
    }

}
