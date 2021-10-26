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