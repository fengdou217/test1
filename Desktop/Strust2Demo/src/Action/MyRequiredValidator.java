package Action;

import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.opensymphony.xwork2.validator.validators.RequiredFieldValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MyRequiredValidator  extends RequiredFieldValidator {




    /**
     * <!-- START SNIPPET: description -->
     * This validator checks that a field is non-null.
     * <!-- END SNIPPET: description -->
     *
     * <p/> <u>Annotation usage:</u>
     *
     * <!-- START SNIPPET: usage -->
     * <p/>The annotation must be applied at method level.
     * <!-- END SNIPPET: usage -->
     *
     * <p/> <u>Annotation parameters:</u>
     *
     * <!-- START SNIPPET: parameters -->
     * <table class='confluenceTable'>
     * <tr>
     * <th class='confluenceTh'> Parameter </th>
     * <th class='confluenceTh'> Required </th>
     * <th class='confluenceTh'> Default </th>
     * <th class='confluenceTh'> Notes </th>
     * </tr>
     * <tr>
     * <td class='confluenceTd'>message</td>
     * <td class='confluenceTd'>yes</td>
     * <td class='confluenceTd'>&nbsp;</td>
     * <td class='confluenceTd'>field error message</td>
     * </tr>
     * <tr>
     * <td class='confluenceTd'>key</td>
     * <td class='confluenceTd'>no</td>
     * <td class='confluenceTd'>&nbsp;</td>
     * <td class='confluenceTd'>i18n key from language specific properties file.</td>
     * </tr>
     * <tr>
     * <td class='confluenceTd'>messageParams</td>
     * <td class='confluenceTd'>no</td>
     * <td class='confluenceTd'>&nbsp;</td>
     * <td class='confluenceTd'>Additional params to be used to customize message - will be evaluated against the Value Stack</td>
     * </tr>
     * <tr>
     * <td class='confluenceTd'>fieldName</td>
     * <td class='confluenceTd'>no</td>
     * <td class='confluenceTd'>&nbsp;</td>
     * <td class='confluenceTd'>&nbsp;</td>
     * </tr>
     * <tr>
     * <td class='confluenceTd'>shortCircuit</td>
     * <td class='confluenceTd'>no</td>
     * <td class='confluenceTd'>false</td>
     * <td class='confluenceTd'>If this validator should be used as shortCircuit.</td>
     * </tr>
     * <tr>
     * <td class='confluenceTd'>type</td>
     * <td class='confluenceTd'>yes</td>
     * <td class='confluenceTd'>ValidatorType.FIELD</td>
     * <td class='confluenceTd'>Enum value from ValidatorType. Either FIELD or SIMPLE can be used here.</td>
     * </tr>
     * </table>
     * <!-- END SNIPPET: parameters -->
     *
     * <p/> <u>Example code:</u>
     *
     * <pre>
     * <!-- START SNIPPET: example -->
     * &#64;RequiredFieldValidator(message = "Default message", key = "i18n.key", shortCircuit = true)
     * <!-- END SNIPPET: example -->
     * </pre>
     *
     *
     * @author Rainer Hermanns
     * @version $Id$
     */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RequiredFieldValidator {

        /**
         * The default error message for this validator.
         * NOTE: It is required to set a message, if you are not using the message key for 18n lookup!
         */
        String message() default "";

        /**
         * The message key to lookup for i18n.
         */
        String key() default "";

        /**
         * Additional params to be used to customize message - will be evaluated against the Value Stack
         */
        String[] messageParams() default {};

        /**
         * The optional fieldName for SIMPLE validator types.
         */
        String fieldName() default "";

        /**
         * If this is activated, the validator will be used as short-circuit.
         *
         * Adds the short-circuit="true" attribute value if <tt>true</tt>.
         *
         */
        boolean shortCircuit() default false;
        String min() default "";
        String max() default "";

        /**
         * The validation type for this field/method.
         */
        ValidatorType type() default ValidatorType.FIELD;

    }

}
