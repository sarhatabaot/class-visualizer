package clsvis.model;

/**
 * Contains possible visibilities of elements.
 *
 * @author Jonatan Kazmierczak [Jonatan (at) Son-of-God.info]
 */
public enum ElementVisibility {
    PUBLIC( '+' ),
    PROTECTED( '#' ),
    PACKAGE( '~' ),
    PRIVATE( '-' ),
    LOCAL( '\0' ),;

    public final String symbolStr;

    ElementVisibility(char symbol) {
        if (symbol == '\0') {
            symbolStr = ""; // special symbol - ignore it
        } else {
            symbolStr = String.format( "<code>%c</code> ", symbol );
        }
    }
}
