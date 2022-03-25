package clsvis.gui;

import clsvis.Utils;

/**
 * Contains definitions of colors for given graphical elements.
 *
 * @author Jonatan Kazmierczak [Jonatan (at) Son-of-God.info]
 */
public enum ColorContext {
    UML_CLASS_NAME( 0xFF0000 ),
    UML_SECTION_TITLE( 0x008000 ),
    UML_TYPE( 0x000080 ),
    UML_PARAMS( 0x008080 ),
    UML_STEREOTYPE( 0x808000 ),
    CLASS_PROCESSED( 0x000000 ),
    CLASS_UNPROCESSED( 0x585858 );

    public final int colorInt;
    public final String colorStr;

    ColorContext(int color) {
        this.colorInt = color;
        this.colorStr = Utils.colorAsRRGGBB( color );
    }
}
