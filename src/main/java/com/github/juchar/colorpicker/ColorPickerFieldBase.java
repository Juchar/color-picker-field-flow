package com.github.juchar.colorpicker;

import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.icon.Icon;

public interface ColorPickerFieldBase<T> extends ColorPickerBase<T> {

  PropertyDescriptor<Boolean, Boolean> SHOW_CHANGE_FORMAT_BUTTON_PROPERTY
      = PropertyDescriptors.propertyWithDefault("showChangeFormatButton", false);

  PropertyDescriptor<Boolean, Boolean> ENABLE_HISTORY_PROPERTY
      = PropertyDescriptors.propertyWithDefault("enableHistory", false);

  PropertyDescriptor<Integer, Integer> MAX_HISTORY_PROPERTY
      = PropertyDescriptors.propertyWithDefault("maxHistory", 10);

  PropertyDescriptor<String, String> HOVER_ICON_PROPERTY
      = PropertyDescriptors.propertyWithDefault("hoverIcon", "vaadin:paintbrush");

  PropertyDescriptor<String, String> NATIVE_INPUT_QUERY_PROPERTY
      = PropertyDescriptors.propertyWithDefault("nativeInputMediaQuery", "");

  PropertyDescriptor<String, String> LABEL_CANCEL_PROPERTY
      = PropertyDescriptors.propertyWithDefault("labelCancel", "");

  PropertyDescriptor<String, String> LABEL_SELECT_PROPERTY
      = PropertyDescriptors.propertyWithDefault("labelSelect", "");

  /**
   * Check if the button to change the color format inside the input field is visible.
   *
   * @return {@code true} if the button is visible, {@code false} else
   */
  default boolean isChangeFormatButtonVisible() {
    return SHOW_CHANGE_FORMAT_BUTTON_PROPERTY.get(this);
  }

  /**
   * Specify if the button to change the color format inside the input field is visible.
   *
   * @param visible {@code true} if the button should be visible, {@code false} else
   */
  default void setChangeFormatButtonVisible(boolean visible) {
    SHOW_CHANGE_FORMAT_BUTTON_PROPERTY.set(this, visible);
  }

  /**
   * Check if history is enabled for picked colors.
   *
   * @return {@code true} if the history is enabled, {@code false} else
   *
   * @see #getMaxHistory()
   */
  default boolean isHistoryEnabled() {
    return ENABLE_HISTORY_PROPERTY.get(this);
  }

  /**
   * Enable or disable the history for picked colors.
   *
   * @param enabled {@code true} if the history should be enabled, {@code false} else
   *
   * @see #setMaxHistory(int)
   */
  default void setHistoryEnabled(boolean enabled) {
    ENABLE_HISTORY_PROPERTY.set(this, enabled);
  }

  /**
   * Check how many colors should be in the history of picked colors.
   *
   * @return The maximum amount of colors in the history
   *
   * @see #isHistoryEnabled()
   */
  default int getMaxHistory() {
    return MAX_HISTORY_PROPERTY.get(this);
  }

  /**
   * Specify how many colors should be in the history of picked colors.
   *
   * @param maxHistory The maximum amount of colors in the history
   *
   * @see #setHistoryEnabled(boolean)
   */
  default void setMaxHistory(int maxHistory) {
    MAX_HISTORY_PROPERTY.set(this, maxHistory);
  }

  /**
   * Get the icon used if hovering the color field.
   *
   * @return The icon
   */
  default Icon getHoverIcon() {
    final String iconString = HOVER_ICON_PROPERTY.get(this);
    final String[] splitted = iconString.split(":");
    return new Icon(splitted[0], splitted[1]);
  }

  /**
   * Set the icon used if hovering the color field.
   *
   * @param icon The icon to show
   */
  default void setHoverIcon(Icon icon) {
    HOVER_ICON_PROPERTY.set(this, icon.getElement().getAttribute("icon"));
  }

  /**
   * Get the media query used to determine if native input should be used.
   *
   * @return The media query
   *
   * @see <a href="https://www.w3schools.com/css/css_rwd_mediaqueries.asp">CSS Media Queries</a>
   */
  default String getNativeInputMediaQuery() {
    return NATIVE_INPUT_QUERY_PROPERTY.get(this);
  }

  /**
   * Set the media query used to determine if native input should be used.
   *
   * @param query The media query without the {@code @media} identifier
   *
   * @see <a href="https://www.w3schools.com/css/css_rwd_mediaqueries.asp">CSS Media Queries</a>
   */
  default void setNativeInputMediaQuery(String query) {
    NATIVE_INPUT_QUERY_PROPERTY.set(this, query);
  }

  default ColorPickerFieldI18n getI18n() {
    return new ColorPickerFieldI18n()
        .setSelect(LABEL_SELECT_PROPERTY.get(this))
        .setCancel(LABEL_CANCEL_PROPERTY.get(this));
  }

  default void setI18n(ColorPickerFieldI18n i18n) {
    LABEL_SELECT_PROPERTY.set(this, i18n.getSelect());
    LABEL_CANCEL_PROPERTY.set(this, i18n.getCancel());
  }
}
