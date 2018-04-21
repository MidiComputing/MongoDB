# MongoDB
MongoDB Java Connection

- MongoDB Java Driver Download
- Creating MongoDB Java Connection
- Connection to MongoDB Database
- MongoDB and Collections
- Insert documents into the database
- Update a document

## MongoDB Java Driver Download
If you have a standalone project, you can download MongoDB Java Driver from this <link> and include it in your project build path.
## Creating MongoDB Java Connection
MongoClient is the interface between our java program and MongoDB server. MongoClient is used to create connection, connect to database, retrieve collection names and create/read/update/delete database, collections, document etc.

One of the MongoDB java driver feature I like most is that it’s thread safe, so we can create an instance of MongoClient once and reuse it. Even if multiple thread accesses it simultaneously, a connection is returned from the internal connection pool maintained by it.

## Connection to MongoDB Database
Once we get the connection to MongoDB server, next step is to create the connection to the database, as shown below. Note that if database is not present, MongoDB will create it for you.
MongoClient provide a useful method to get all the database names, as shown below.
## MongoDB and Collections
Every database can have zero or multiple collections, they are like tables in relational database servers except that you don’t have specific format of data. Think of it like a generic list vs list of Strings in terms of java programming language.
## Insert documents into the database
This next step we’re going to do a few things. Since we are inserting our documents with specific _id values
## Update a document
We should probably consider learning how to update a document as well. After all, we have 4 documents in the collection but only one of them have any useful data. We use the updateOne() method to update a single document along with the $set operator. 

...
