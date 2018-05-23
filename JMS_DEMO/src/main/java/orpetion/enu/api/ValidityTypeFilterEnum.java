/**
 *
 */
package orpetion.enu.api;

/**
 * @author p.maurya
 *
 */
public enum ValidityTypeFilterEnum implements FilterEnum {

    VALIDITY_TYPE_ID("validityTypeId"),

    VALIDITY_NO("valiityNo"),

    NAME("name"),

    DESCRIPTION("description"),

    IS_DEACTIVATED("isDeactivated"),

    CLIENT_ID("clientId");

    private String property;

    private ValidityTypeFilterEnum(final String value) {
        this.property = value;
    }

    public String getValue() {
        return this.property;
    }
}
