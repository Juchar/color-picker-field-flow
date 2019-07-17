package com.github.juchar.colorpicker;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.internal.StateNode;

/**
 * Utility class for text field mixin web components to disable/enable client side validation.
 *
 * @author Vaadin Ltd
 */
final class RequiredValidationUtil {

  RequiredValidationUtil() {
    // utility class should not be instantiated
  }

  static void attachConnector(Component component) {
    execJS(component, "window.Vaadin.Flow.textConnector = {\n"
        + "        disableClientValidation: function (textComponent){\n"
        + "            if ( typeof textComponent.$checkValidity == 'undefined'){\n"
        + "                textComponent.$checkValidity = textComponent.checkValidity;\n"
        + "                textComponent.checkValidity = function() { return true; };\n"
        + "            }\n  "
        + "            if ( typeof textComponent.$validate == 'undefined'){\n"
        + "                textComponent.$validate = textComponent.validate;\n"
        + "                textComponent.validate = function() { return true; };\n"
        + "            }\n  },\n"
        + "        enableClientValidation: function (textComponent){\n"
        + "            if ( textComponent.$checkValidity ){\n"
        + "                textComponent.checkValidity = textComponent.$checkValidity;\n"
        + "                delete textComponent.$checkValidity;\n"
        + "            }\n  "
        + "            if ( textComponent.$validate ){\n"
        + "                textComponent.validate = textComponent.$validate;\n"
        + "                delete textComponent.$validate;\n"
        + "            }\n  }\n }");
  }

  static void updateClientValidation(boolean requiredIndicatorVisible,
      Component component) {
    if (requiredIndicatorVisible) {
      disableClientValiation(component);
    } else {
      enableClientValiation(component);
    }
  }

  static void disableClientValiation(Component component) {
    execJS(component,
        "window.Vaadin.Flow.textConnector.disableClientValidation($0);");
  }

  static void enableClientValiation(Component component) {
    execJS(component,
        "window.Vaadin.Flow.textConnector.enableClientValidation($0);");
  }

  private static void execJS(Component component, String js) {
    StateNode node = component.getElement().getNode();

    node.runWhenAttached(ui -> ui.getInternals().getStateTree()
        .beforeClientResponse(node, context -> ui.getPage()
            .executeJavaScript(js, component.getElement())));
  }
}
