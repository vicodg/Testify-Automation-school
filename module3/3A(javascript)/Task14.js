const books = {
    title: 'The Good Parts of Java',
    description: 'A book about the good parts of JavaScript.',
    numberOfPages: 176,
    author: 'victor odogwu',
    reading: true,
    toggleReadingStatus: function() {
        this.reading = !this.reading;
        console.log("Reading status: " + (this.reading ? "Currently reading" : "Not currently reading"));
    }
}
    
books.toggleReadingStatus();

