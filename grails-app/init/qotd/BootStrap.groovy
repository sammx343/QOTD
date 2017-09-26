package qotd

class BootStrap {

    def init = { servletContext -> 
      new qotd.Quote(author: 'Larry Wall',
        content: "There is more than one method to our madness.").save()
      new qotd.Quote(author: 'Chuck Norris Facts',
        content: "Chuck Norris always uses his own degisn patterns, and his favorite is the Roundhouse Kick.").save()
      new qotd.Quote(author: 'Eryc Raymond',
        content: "Being a social outcast helps you stay concentrated on the really important things, like hacking and coding").save()
    }
    def destroy = {
    }
}
