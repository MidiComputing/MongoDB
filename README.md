# MongoDB
MongoDB Java Connection

-MongoDB Java Driver Download
-Creating MongoDB Java Connection
-Connection to MongoDB Database
-MongoDB and Collections
-Insert documents into the database
-Find and print documents from the database
-Update a document.

## MongoDB Java Driver Download
If you have a standalone project, you can download MongoDB Java Driver from this <link> and include it in your project build path.
## Creating MongoDB Java Connection
MongoClient is the interface between our java program and MongoDB server. MongoClient is used to create connection, connect to database, retrieve collection names and create/read/update/delete database, collections, document etc.

One of the MongoDB java driver feature I like most is that it’s thread safe, so we can create an instance of MongoClient once and reuse it. Even if multiple thread accesses it simultaneously, a connection is returned from the internal connection pool maintained by it.
