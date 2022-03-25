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
    PUBLIC,
    PROTECTED,
    PRIVATE,
    ABSTRACT,
    STATIC,
    FINAL,
    TRANSIENT,
    VOLATILE,
    SYNCHRONIZED,
    NATIVE,
    STRICT, // TODO: should be represented as strictfp
    READ_ONLY,
    //WriteOnly,
    INTERFACE,
    ENUM, // TODO: should be presented as "enumeration"
    ANNOTATION,
    RECORD,
    SEALED,
    THROWABLE,
    LOCAL_CLASS,
    MEMBER_CLASS,
    SYNTHETIC,
    BRIDGE,
    DEFAULT,
    IMPLICIT,
    VAR_ARGS,
    ;

    public static final Set<ElementModifier> visibilityModifiers = Collections.unmodifiableSet( EnumSet.of(
            ElementModifier.PRIVATE, ElementModifier.PROTECTED, ElementModifier.PUBLIC) );

    private final String asString;

    ElementModifier() {
        asString = Introspector.decapitalize( name() );
    }

    @Override
    public String toString() {
        return asString;
    }
}
