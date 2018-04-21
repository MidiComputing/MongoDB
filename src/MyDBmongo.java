import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
 
 public class MyDBmongo {
	 
  public static void main(String[] args) {
   Mongo mongo = null;
   DB db = null;
   DBCollection table = null;
   
   // Connection to mongoDB Server
   try{
   mongo = new Mongo("localhost", 27017);
   } catch (UnknownHostException e){
	   e.printStackTrace();
   }
   // Get the connections
   db = mongo.getDB("BenaceurDB");
   table = db.getCollection("MyCollection");
   
   table.drop();
   
   // List all databases
   System.out.println("Databases: ");
   List<String> dbs = mongo.getDatabaseNames();
   for (String dbset : dbs) {
    System.out.println(dbset);
   }
   
   // Collections from a database
   System.out.println("\nCollections: ");
   Set<String> tables = db.getCollectionNames();
   db = mongo.getDB("local");
   for (String coll : tables) {
    System.out.println(coll);
   }
   
   //create documents and insert
   BasicDBObject document = new BasicDBObject();
   document.put("name", "Henry");
   document.put("quality", "A");
   document.put("amount", 1400);
   
   BasicDBObject document2 = new BasicDBObject();
   document2.put("name", "Franck");
   document2.put("quality", "A");
   document2.put("amount", 1450);
   
   BasicDBObject document3 = new BasicDBObject();
   document3.put("name", "John");
   document3.put("quality", "B");
   document3.put("amount", 1200);
   
   BasicDBObject document4 = new BasicDBObject();
   document4.put("name", "Bruce");
   document4.put("quality", "C");
   document4.put("amount", 850);
   
   table.insert(document);
   table.insert(document2);
   table.insert(document3);
   table.insert(document4);
   
   // Data of collection are output
   System.out.println("\nCollection Data");
   BasicDBObject searchQuery = new BasicDBObject();
   
   DBCursor cursor = table.find(searchQuery);
   
   while (cursor.hasNext()) {
    System.out.println(cursor.next());
   } 
   
   // Update
   BasicDBObject query = new BasicDBObject();
   query.put("name", "John");
   
   BasicDBObject newDocument = new BasicDBObject();
   newDocument.put("name", "John-updated");
   
   BasicDBObject updateObj = new BasicDBObject();
   updateObj.put("$set", newDocument);
   
   table.update(query, updateObj);
   
   // Data of collection are output
   System.out.println("\nCollection Data After Update");
   searchQuery = new BasicDBObject();
   
   cursor = table.find(searchQuery);
   
   while (cursor.hasNext()) {
    System.out.println(cursor.next());
   }
  }}
