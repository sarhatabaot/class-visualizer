package clsvis.model;

import clsvis.Utils;

/**
 * Indicates kind of element and holds some of properties.<br/>
 * This class is equivalent of {@link javax.lang.model.element.ElementKind}.
 *
 * @author Jonatan Kazmierczak [Jonatan (at) Son-of-God.info]
 */
public enum ElementKind {
    CLASS( 0xFFF2CC ),
    INTERFACE( 0xCCFFCC ),
    ENUM( 0xCCCCFF ),
    ANNOTATION_TYPE( 0xFECCFF ),
    THROWABLE( 0xFF9F80 ),
    EXTENDS( 0x4F4F4F, '\u25b2' ),
    IMPLEMENTS( 0xA9A9A9, '\u25b2' ),
    CONSTANTS( 0xFF6F60, '\u25a0' ),
    FIELDS( 0xA0C9E8, '\u25a0' ),
    PROPERTIES( 0x4A72A1, '\u25a0' ),
    CONSTRUCTORS( 0xFFA500, '\u2666' ),
    METHODS( 0xFF00FF, '\u2666' ),
    ANNOTATIONS( 0xFECCFF, '\u25cf' ),
    PARAMETERS( 0x008080, '\u25cf' ),
    THROWS( 0xA90000, '\u25cf' ),;

    /** RGB color of this kind. */
    public final int colorNum;
    /** Symbol representing this kind. */
    public final String symbolStr;
    /** Symbol with title of this kind (title itself is returned by method toString()). */
    public final String titleWithSymbolStr;

    private static final String CLASS_TEMPLATE
            = "<span style=\"background-color: #%s; color: black\">&nbsp;<code><b>%c</b></code>&nbsp;</span>";
    private static final String MEMBER_TEMPLATE = "<span color=%s>&nbsp;<code>%c</code> </span>";
    private static final char CLASS_INDICATOR = '\0';

    ElementKind(int color) {
        this( color, CLASS_INDICATOR );
    }

    ElementKind(int color, char symbol) {
        this.colorNum = color;
        String template;
        if (symbol == CLASS_INDICATOR) {
            symbol = name().charAt( 0 );
            template = CLASS_TEMPLATE;
        } else {
            template = MEMBER_TEMPLATE;
        }
        this.symbolStr = String.format( template, Utils.colorAsRRGGBB( color ), symbol );
        this.titleWithSymbolStr = symbolStr + name();
    }
}
