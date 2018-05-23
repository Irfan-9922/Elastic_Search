/**
 *
 */
package org.java.dto.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import de.bonprix.dto.AbstractI18NLanguageElement;
import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * @author p.maurya
 *
 */
@GeneratePojoBuilder(
    intoPackage = "*.builder")
@JsonIgnoreProperties(
    ignoreUnknown = true)
public class ValidityTypeLanguage extends AbstractI18NLanguageElement {

    /**
     *
     */
    private static final long serialVersionUID = -150415268134278648L;
    /** The description. */
    private String description;

    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

}
