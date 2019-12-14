# Response to [This blog](https://github.com/Wealon11/UFO/blob/master/UFO.Blog.Entry.-.review.final.pdf)

## Literature found to be helpful
- [ScalaWebTest](https://www.scalawebtest.org/documentation.html)
- [Different types of integration tests](https://www.educba.com/integration-testing/)
- [Blog about Integration testing](https://fullstackmark.com/post/20/painless-integration-testing-with-aspnet-core-web-api)

In the blog it has been described that the only integration tests have been performed in the backend, while this is valid, it is also important to make sure that the frontend are getting the right objects or information.

It would make sense for the blog writers to have more than a single test, while this does show how to write it, it does not prove how useful they are. The hypothesis of "Tests are hard to write but a few are good" does not agree with the experiment they have made.

Making sure that the backend produces the right thing is important but it could still be sending the wrong information or formatted wrongly in the frontend. This means that the tests are passing but we do not know if it is working in the frontend. This means that we also have to test the frontend which is usually easier as many different tools have been created to help with this task.

## ScalaWebTest
This is a tool that has been made to help create integration tests for web frontends. This tool has a lot of documentation and thus should be implemented fairly easily into a project.
Using a tool like this could make it possible to have a couple of integration tests up and running rather quickly.

Integration tests should also make sure that the integration between different parts of the system is working and therefore needs something in the frontend as well. Having this included would give the conclusion a better look as it would be fully tested and would still be quite simple to include. It does not require a lot of tests but just a few to prove that the logic is working.

ScalaWebTest is open source so everyone can contribute to it. Looking through their Github it is also updated fairly often which means it is still in development, and that is a good thing. This means that it will be updated with the best and easiest practices and still be relevant to the new technologies.

This tool existing counters the blogs conclusion that integration tests are hard to write, as this is a tool for this exact thing to be made easy.

## Types of integration testing
Because there are different ways of making integration tests it could be beneficial to the blog writer to know which one they are doing and what the advantages and disadvantages are.
The literature explores 4 different ways of doing integration tests and lists the advantages and disadvantages of each approach.
The blog could have incorporated this and explained why they chose the approach they did and why they did not choose another one. This would give the reader more information about integration testing, and from the hypothesis of the blog "Integration tests are hard to write", this is something that could have made it simpler to understand. By

The blog says that integration tests are hard to write but many tools have been created to ease the process so I feel like their conclusion is wrong. Even from their own example in the blog it looked fairly easy to implement. Testing everything could be hard but again, in the hypothesis "A few good ones are helpful" so there should not be a need for testing everything thoroughly.
