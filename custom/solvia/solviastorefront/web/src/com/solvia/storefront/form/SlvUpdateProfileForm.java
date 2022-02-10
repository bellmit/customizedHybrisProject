package com.solvia.storefront.form;

import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateProfileForm;

public class SlvUpdateProfileForm extends UpdateProfileForm {

    private String slvCustomField;
    private Integer slvCustomFieldInteger;

    public Integer getSlvCustomFieldInteger() {
        return slvCustomFieldInteger;
    }

    public void setSlvCustomFieldInteger(Integer slvCustomFieldInteger) {
        this.slvCustomFieldInteger = slvCustomFieldInteger;
    }

    public String getSlvCustomField() {
        return slvCustomField;
    }

    public void setSlvCustomField(String slvCustomField) {
        this.slvCustomField = slvCustomField;
    }
}
