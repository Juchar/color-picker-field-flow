[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/jucharcolor-picker-field-flow)

# Color Picker Field Flow

Vaadin server-side implementation of [&lt;color-picker-field&gt;](https://github.com/Juchar/color-picker-field). 
Have a look there to see the demos and options. 

## Converted vs. Raw Value
There are two implementations of the color picker field:
 - `ColorPickerField`- Provides the value automatically converted to a `java.awt.Color`
 - `ColorPickerFieldRaw` - Provides the value as raw CSS Color `String`

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080
