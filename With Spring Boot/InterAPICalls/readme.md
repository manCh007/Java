# InterApi Calls

We here will be discussing on three different ways we can call any other api in the same or different service.
1. RestTemplate : this is a synchronous way to call an api where the flow waits until the message comes back
2. Feign Client : this is also similar (synchronous) just that we can use an underlying interface format to abstract the 
implementation
3. WebClient : this is an asynchronous method of calling an api, which means once you call the api the flow doesn't wait
for the response to come back. It moves ahead and once the response comes back it handles it.