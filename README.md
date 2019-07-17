[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/jucharcolor-picker-field-flow)

This project is the Component wrapper implementation of [`<color-picker-field>`](https://github.com/Juchar/color-picker-field) element
for use from the server side with [Vaadin Flow](https://github.com/vaadin/flow).

## Converted vs. Raw Value
There are two implementations of the color picker:
 - `ColorPickerField`- Provides the value automatically converted to a `java.awt.Color`
 - `ColorPickerFieldRaw` - Provides the value as raw CSS Color `String`

## Running the component demo
Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

## Installing the component
Run from the command line:
- `mvn clean install -DskipTests`

## Using the component in a Flow application
To use the component in an application using maven,
add the following dependency to your `pom.xml`:
```
<dependency>
    <groupId>com.github.juchar</groupId>
    <artifactId>color-picker-field-flow</artifactId>
    <version>${component.version}</version>
</dependency>
```

## Flow documentation
Documentation for flow can be found in [Flow documentation](https://github.com/vaadin/flow-and-components-documentation/blob/master/documentation/Overview.asciidoc).

## Contributing
- Use the coding conventions from [Flow coding conventions](https://github.com/vaadin/flow/tree/master/eclipse)
- [Submit a pull request](https://www.digitalocean.com/community/tutorials/how-to-create-a-pull-request-on-github) with detailed title and description
- Wait for response from the author

## License
Apache License 2.0
