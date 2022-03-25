package clsvis.model;

import java.beans.Introspector;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/**
 * Constants representing modifiers of language element.<br/>
 * This class is improved equivalent of {@link javax.lang.model.element.Modifier}.
 *
 * @author Jonatan Kazmierczak [Jonatan (at) Son-of-God.info]
 *
 * @see java.lang.reflect.Modifier
 */
public enum ElementModifier {
    PUBLIC("Public"),
    PROTECTED("Protected"),
    PRIVATE("Private"),
    ABSTRACT("Abstract"),
    STATIC("Static"),
    FINAL("Final"),
    TRANSIENT("Transient"),
    VOLATILE("Volatile"),
    SYNCHRONIZED("Synchronized"),
    NATIVE("Native"),
    STRICT("Strict"), // TODO: should be represented as strictfp
    READ_ONLY("ReadOnly"),
    //WriteOnly,
    INTERFACE("Interface"),
    ENUM("Enum"), // TODO: should be presented as "enumeration"
    ANNOTATION("Annotation"),
    RECORD("Record"),
    SEALED("Sealed"),
    THROWABLE("Throwable"),
    LOCAL_CLASS("LocalClass"),
    MEMBER_CLASS("MemberClass"),
    SYNTHETIC("Synthetic"),
    BRIDGE("Bridge"),
    DEFAULT("Default"),
    IMPLICIT("Implicit"),
    VAR_ARGS("VarArgs"),
    ;

    private final String methodName;
    public static final Set<ElementModifier> visibilityModifiers = Collections.unmodifiableSet( EnumSet.of(
            ElementModifier.PRIVATE, ElementModifier.PROTECTED, ElementModifier.PUBLIC) );

    private final String asString;

    ElementModifier(final String methodName) {
        this.methodName = methodName;
        asString = Introspector.decapitalize( methodName );
    }

    @Override
    public String toString() {
        return asString;
    }

    public String getMethodName() {
        return methodName;
    }
}
