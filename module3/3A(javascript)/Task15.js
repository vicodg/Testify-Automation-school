
const books = [
    {
        title: 'JavaScript: The Good Parts',
        description: 'A book about the good parts of JavaScript.',
        numberOfPages: 176,
        author: 'victor odogwu',
        reading: true
    },
    {
        title: 'Eloquent JavaScript',
        description: "A comprehensive guide to JavaScript programming.",
        numberOfPages: 472,
        author: 'Marijn baker',
        reading: false
    },
    {
        title: 'You Dont Know JS',
        description: 'A series of books diving deep into the core mechanisms of JavaScript.',
        numberOfPages: 256,
        author: 'samson sasa',
        reading: true
    }
];

for (let i = 0; i < books.length; i++) {
    if (books[i].reading) {

        console.log('Title: ' + books[i].title);
        console.log('Description: ' + books[i].description);
        console.log('Number of Pages: ' + books[i].numberOfPages);
        console.log('Author: ' + books[i].author);
        console.log('Reading: ' + books[i].reading);
    
    }
}
