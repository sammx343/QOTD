package qotd


class QuoteController {	
	static scaffold = Quote

   	def home() {
    	println Quote.list()
    	render "<h1> Programmers blablabla </h1>"
    }

    def random(){
    	def randomQuote = quoteService.getRandom()
		[ quote: randomQuote]
    }
}
