# SObject-types

Stub declarations for Salesforce SObject types encoded as compilable Java, built on top of [standard-types](https://github.com/apex-dev-tools/standard-types).

These stub declarations help support static analysis of Apex code in [apex-ls](https://github.com/apex-dev-tools/apex-ls) but you may also find them useful for other purposes. They have been encoded in Java to get the benefit of type checking by javac so it easier to spot when something is amiss. In apex-ls JVM reflection is used to 'read' the stubs as part of the static analysis.

The library is versioned to reflect Salesforce API numbers, so currently v63.X.X matches the Salesforce Spring '25 API.

## Installation

To use the jar in a maven project add the following to your pom.xml

```xml
<dependency>
    <groupId>io.github.apex-dev-tools</groupId>
    <artifactId>sobject-types</artifactId>
    <version>63.0.0</version>
</dependency>
```

### Build From Source

```sh
mvn install -Dgpg.skip=true
```

## Development

### Prepare for API Update

Update API version numbers in `pom.xml`:

* `standard-types` version. Also update jar version in `src/META_INF/MANIFEST.MF`.

* `com.force.api` versions. See [package list](https://mvnrepository.com/search?q=com.force.api) to check latest patch numbers.

* `sf.apiVersion` property default.

### Generate Types from an Org

To generate types, we need an org with as many features enabled as possible, otherwise certain SObjects will not be available. `config/org-all.json` can be used for a scratch org. This may need changing if/when [the features list](https://developer.salesforce.com/docs/atlas.en-us.sfdx_dev.meta/sfdx_dev/sfdx_dev_scratch_orgs_def_file_config_values.htm) has new additions. There is also a `config/org-lite.json`, which can be used to add new features in isolation (diff of the previous feature list) for the purpose of collecting only new objects with most important fields. The all config is error prone and difficult to troubleshoot.

1. Create org

    ```sh
    sf org create scratch -f config/org-all.json
    ```

1. Execute `com.financialforce.tools.SObjectToJava` script via `mvn exec`:

    ```sh
    mvn test-compile
    ```

    ```sh
    mvn exec:exec -Dsf.user="[username]" -Dsf.pass="[password + security token]"
    ```

1. The files will print to `./generated/`.

#### Arguments

| Key | Description |
| --- | --- |
| `sf.user` | Must be full username e.g. `test-xx@example.com`. |
| `sf.password` | For scratch org, `sf org generate password -o username`. You may also need to append a [security token](https://help.salesforce.com/s/articleView?id=xcloud.user_security_token.htm). |
| `sf.instance` (Optional) | Defaults to `test` for scratch org (sandbox). Use `login` for other org types. |
| `sf.apiVersion` (Optional) | Override current api version e.g. `62.0` |

#### Debugging

You can also create an `Application` Run/Debug configuration in Intellij to run the `SObjectToJava` class directly with `java`. Set CLI arguments as `"user" "password" "instance" "apiVersion"`.

### Resolving File Differences

After generating the types, they need merging into the existing src structure. It contains manual edits so cannot simply be overwritten.

Use a diff tool to move content across. For example, Intellij has `Compare With...` which can be run on `generated/` and `SObjects/` directories.

In the `generated/` dir, to quickly copy newly added files across:

```sh
diff -r ../src/main/java/com/nawforce/runforce/SObjects ./ | sed -n 's/Only in \.\/\{0,1\}: \(.*\)/\1/p' | xargs -I {} cp {} ../src/main/java/com/nawforce/runforce/SObjects
```

To verify new fields to existing objects were not missed, print them to `!diff.txt` file (ignoring copyright):

```sh
diff -rub -I 'Copyright' ../src/main/java/com/nawforce/runforce/SObjects ./ | grep -E "^\+.[^\*]" | grep -v '+++ b/' > '!diff.txt'
```

The file should be only `+++` lines if there are no missing additions.
