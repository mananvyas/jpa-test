#Description:
*Primarily facing issue of infinite recursion and hit across StackOverflow - Error

#Reference Post:
*https://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion
Above post explains alternatives to deal with the situation - very useful.

#Sample Payload

Request URL: http://localhost:8080/person
Request Type: Post
Request Body:

{
	"name": "Test Person",
	"age": "54",
	"car" :
	[
		{
			"brand": "fiat",
			"type": "auto"
		}
	]
}