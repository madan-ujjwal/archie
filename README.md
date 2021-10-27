# archie

## Steps to follow : 

* clone this repository to your local (https://www.atlassian.com/git/tutorials/setting-up-a-repository/git-clone)
* create a branch with your personal name (https://www.atlassian.com/git/tutorials/using-branches/git-checkout)
* create a second branch with `<name>_feature`, this will be the branch you will push all your changes
* once the changes are pushed, you will create a PR from second branch to first 
  (https://docs.github.com/en/github/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)
  

## What are the changes to make

* this project has multiple `TODO`s you have to complete
* import this project on intellij (https://www.jetbrains.com/help/idea/maven-support.html#maven_import_project_start)
* to get where they are use the TODO panel in your intellij (https://www.jetbrains.com/help/idea/using-todo.html)
* if these TODOs are not complete your maven build will fail due to failure of integration tests
* you also have to write unit tests for all the code you have written since there has to be a 100% UT coverage, and builds will fail without that
* once your builds are successful you can create a PR and get that reviewed from your mentor / buddy
* resolve all the comments suggested in the review
* once all is good then merge


## Help regarding the changes

* this repo includes multiple layers, namely
    * controller layer : this layer is responsible for accept http requests
    * service layer : this layer is responsible for all the business logic
    * repository layer : this layer is responsible for all communications with databases
* this repo also includes model objects, namely
    * dto : this model holds the request and response entities
    * bo : this model holds the business objects
    * dao : this model holds all the data level objects 
    NOTE : in the project you will be converting from one model to the other
      
## So what am I supposed to do

* the module is supposed to be a http server
* the controller layer has 3 calls : 
  * POST (`postCall`)
    1. this call will accept a post request
    2. convert the request object to BO object
    3. write the service layer logic provided in the TODO
    4. convert the BO to mongo entity and persist the entity in mongo 
    5. push the BO to rmq post successful persisting in mongo
    6. post successfully pushing to rmq, convert the mongo entity to response
    7. return the response as POST call response
    8. accept the same pushed payload from rmq
    9. after accepting from rmq, convert the BO to mysql entity
  * GET (`getFromMongoForId`)
    1. this call will accept a archie id
    2. lookup the id in your mongo collection
    3. return the entity as response if there is an entity for that id
    4. if there is no entity for that id, give back error code 400 with message `no entity present for requested id`
  * GET (`getFromMysqlForId`)
    1. this is something you are supposed to write from scratch
    2. this api is to listen on `/archie/v1/mysql/{archieId}`
    3. this api is to accept an archie id in the request
    4. this api then is to then lookup that id in mysql and fetch the entity
    5. return the entity as response if there is an entity for that id
    6. if there is no entity for that id, give back error code 400 with message `no entity present for requested id`
* you are also supposed to cover your code with UT tests, there is a 100% coverage restriction, 
  so your builds will fail if the coverage is not reached
  take reference from `QueueDefinitionTest.shouldGetQueueUrl` to see how to write a unit test
* integration tests have already been written, your aim is to successfully pass them