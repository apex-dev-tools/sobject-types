# SObject-types

Stub declarations for Salesforce SObject types encoded as compilable Java built on top of [standard-types](https://github.com/apex-dev-tools/standard-types)

These stub declarations help support static analysis of Apex code in [apex-ls](https://github.com/apex-dev-tools/apex-ls) but you may also find them useful for other purposes. They have been encoded in Java to get the benefit of type checking by javac so it easier to spot when something is amiss. In apex-ls JVM reflection is used to 'read' the stubs as part of the static analysis.

The original versions of the stubs were autogenerated via a couple of Java tools but they have required a lot of manual work to correct into the current form. Now this is fairly stable, the plan is to add some level of verification tooling to this project so that differences with future versions can be more easily identified and corrected.

The library is versioned to reflect Salesforce API numbers, so currently v59.X.X matches the Salesforce Winter '24 API.

## Installation

To use the jar in a maven project add the following to your pom.xml

    <dependency>
        <groupId>io.github.apex-dev-tools</groupId>
        <artifactId>sobject-types</artifactId>
        <version>59.0.1</version>
    </dependency>

### Build From Source

    mvn install -Dgpg.skip=true

## Development

### Generate Types from Org

SObject type definitions can be generated from an org using the scripts defined in `com.financialforce.tools.SObjectToJava`. `sf.instance` is optional and defaults to `login`.

    mvn test-compile
    mvn exec:exec -Dsf.user="[username]" -Dsf.pass="[password + security token]" -Dsf.instance="[login/test]"

The files will print to `generated/`. Files can then be compared and copied into `src`.

Some command ideas to save time, run from `generated/`:

    # Copies all brand new files to src
    diff -r ../src/main/java/com/nawforce/runforce/SObjects ./ | sed -n 's/Only in \.\/\{0,1\}: \(.*\)/\1/p' | xargs -I {} cp {} ../src/main/java/com/nawforce/runforce/SObjects

    # Print additions, ignoring copyright to a file ./generated/!diff.txt
    diff -rub -I 'Copyright' ../src/main/java/com/nawforce/runforce/SObjects ./ | grep -E "^\+" | grep -v '+++ b/' > '!diff.txt'
