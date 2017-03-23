# HAPI (Hub of APIs)

HAPI is a public REST Web API directory which stores the discovered REST Web APIs by our [APIDiscoverer](https://github.com/SOM-Research/APIDiscoverer) thus allowing developers to browse them and download their corresponding OpenAPI specifications.
We have also developed  [MashapeDiscoverer](https://github.com/SOM-Research/APIDiscoverer/tree/master/som.mashape.discoverer), a proof-of-concept to show how the API call examples can be derived from other sources like available examples in the API documentation (in this specific case, from APIs in the [Mashape marketplace](https://market.mashape.com), a documentation portal with over 2,000 APIs) by using [Selenium](http://docs.seleniumhq.org/projects/webdriver/) to crawl the documentation pages and generate their correspondent OpenAPI specs.

HAPI is also an open source community-driven project which invites developers to contribute to the directory. 
Following the GitHub pull-based development model, anyone can add new APIs by sending pull requests.
Developers can also propose changes to existing APIs. A change may involve fixing an OpenAPI specification (e.g., correcting a parameter type) or adding new features (e.g., endpoints or parameters).

Additionally, we have created the *external-sources* folder which contains links to other initiatives aiming at discovering and sharing OpenAPI specs, namely:

- **APIs.guru**: an open source directory of OpenAPI specifications.
- **APIs.io**: an experimental API Search service to help discover APIs on the web.


## Who is behind this project?

* [Hamza Ed-douibi](http://github.com/hamzaed/ "Hamza Ed-douibi")
* [Javier Canovas](http://github.com/jlcanovas/ "Javier Canovas")
* [Jordi Cabot](http://github.com/jcabot/ "Jordi Cabot")

Hamza, Javier and Jordi are currently members of SOM, a research team of IN3-UOC.

