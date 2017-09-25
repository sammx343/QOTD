package qotd


class QuoteController {	
	static scaffold = Quote
  def quoteService
  
   	def home() {
    	println Quote.list()
    	render "<h1> Programmers blablabla </h1>"
    }

    def random(){
    	def randomQuote = quoteService.getRandomQuote()
		  [ quote: randomQuote]
    }
}
