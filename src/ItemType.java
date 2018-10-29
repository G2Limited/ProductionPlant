/*Garrett Graber
09/29/2018
This file creates an enum of ItemType and will store information
for the Item Type and Code*/

/*All items will have a pre-set type. Currently there are 4 types.
Create an enum called ItemType that will
store the following information
Type          Code
Audio          AU
Visual         VI
AudioMobile    AM
VisualMobile   VM */

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  final String code;

  ItemType(String code) {
    this.code = code;
  }

  //get method for returning the value code
  public String getCode() {
    return code;
  }
}

