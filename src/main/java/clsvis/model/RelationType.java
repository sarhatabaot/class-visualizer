package clsvis.model;

import clsvis.Utils;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/**
 * Type of relation between 2 {@link Class_}es.
 *
 * @author Jonatan Kazmierczak [Jonatan (at) Son-of-God.info]
 */
public enum RelationType {
    SUPER_CLASS( "&nbsp;&uarr;", "&nbsp;&darr;" ),
    SUPER_INTERFACE( "&nbsp;&uarr;", "&nbsp;&darr;", 0xA9A9A9 ),
    INNER_CLASS( "&oplus;", "&otimes;" ),
    /* Not supported yet. */
    //Aggregation("&rarr;", "&larr;"),
    ASSOCIATION( "&rarr;", "&larr;" ),
    DEPENDENCY( "&rarr;", "&larr;", 0xA9A9A9 ),
    DEPENDENCY_THROWS( "&rarr;", "&larr;", 0xA90000 ),
    DEPENDENCY_ANNOTATION( "&rarr;", "&larr;", 0x808000 ),;

    /** RGB color of this relation. */
    public final int colorNum;

    private final Map<RelationDirection, String> asStringPriv = new EnumMap<>( RelationDirection.class );
    /** String representation of both directions of this relation. */
    public final Map<RelationDirection, String> asString = Collections.unmodifiableMap( asStringPriv );

    RelationType(String toSymbol, String fromSymbol) {
        this( toSymbol, fromSymbol, 0 );
    }

    RelationType(String toSymbol, String fromSymbol, int color) {
        this.colorNum = color;
        asStringPriv.put( RelationDirection.OUTBOUND, asString( toSymbol, color ) );
        asStringPriv.put( RelationDirection.INBOUND, asString( fromSymbol, color ) );
    }

    private static String asString(String symbol, int color) {
        //return String.format("%s ", symbol);
        return String.format( "<span color=%s>%s</span> ", Utils.colorAsRRGGBB( color ), symbol );
    }
}
