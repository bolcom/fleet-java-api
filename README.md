
# Fleet Java API

Java library that connects to the Fleet REST API. 
 
This library contains Java classes used in the API to GET, PUT and DELETE resources. It uses Feign to generate an 
 implementation.
 
## Usage 

```
FleetApi fleetApi = FleetClient.create(url);

String name = "unitName";
FileContents fileContents = java.util.Base64.getEncoder().encode(myUnitDescription.getBytes());

fleetApi.putUnit(name, new DesiredUnitState(name, State.launched, fileContents));


```
