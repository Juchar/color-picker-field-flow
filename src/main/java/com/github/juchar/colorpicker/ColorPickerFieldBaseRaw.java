package com.github.juchar.colorpicker;

import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface ColorPickerFieldBaseRaw
    extends ColorPickerFieldBase<String>, ColorPickerBaseRaw {

  PropertyDescriptor<Boolean, Boolean> ENABLE_CSS_CUSTOM_PROPERTIES_PROPERTY
      = PropertyDescriptors.propertyWithDefault("enableCssCustomProperties", false);

  /**
   * Enable CSS Custom Properties to be used in the input field.
   *
   * @param enabled {@code true} if enabled, {@code false} else
   */
  default void setCssCustomPropertiesEnabled(boolean enabled) {
    ENABLE_CSS_CUSTOM_PROPERTIES_PROPERTY.set(this, enabled);
  }

  /**
   * Check if CSS Custom Properties are enabled to be used in the input field.
   *
   * @return {@code true} if enabled, {@code false} else
   */
  default boolean hasCssCustomPropertiesEnabled() {
    return ENABLE_CSS_CUSTOM_PROPERTIES_PROPERTY.get(this);
  }
}
