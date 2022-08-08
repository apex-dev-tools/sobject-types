## Sobject-types

Stub declarations for Salesforce SObject types encoded as compilable Java built on top of [standard-types](https://github.com/apex-dev-tools/standard-types)

These stub declarations help support static analysis of Apex code in [apex-link](https://github.com/nawforce/apex-link) but you may also find them useful for other purposes. They have been encoded in Java to get the benefit of type checking by javac so it easier to spot when something is amiss. In apex-link JVM reflection is used to 'read' the stubs as part of the static analysis. 
 
### Maven
To use the jar in a maven project add the following to your pom.xml

    <dependency>
        <groupId>io.github.apex-dev-tools</groupId>
        <artifactId>sobject-types</artifactId>
        <version>55.0.0</version>
    </dependency>

