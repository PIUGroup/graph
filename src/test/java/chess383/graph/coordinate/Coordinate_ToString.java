/*
 *  Coordinate_ToString.java
 *
 *  chess383 is a collection of chess related utilities.
 *  Copyright (C) 2015 -2020 Jörg Dippel
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package chess383.graph.coordinate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * <p>
 * The class Coordinate_ToString implements an upper tester
 * </p>
 *
 * @author    Jörg Dippel
 * @version   July 2020
 *
 */
@DisplayName("the public method String toString( ) for class Coordinate is tested")
public class Coordinate_ToString {

    @DisplayName("toString(): should be equal to the name defined by the coordinate")
    @ParameterizedTest(name = "for a given coordinate name \"{0}\" the equal toString() representation \"{1}\" is returned")
    @CsvSource({
    	"a1, a1",
    	"a8, a8",
    	"h1, h1",
    	"h8, h8",
    	"e5, e5"
    })
    void toString_shouldBeEqual_WithTheNameDefinedByTheCoordinate( String coordinateDefiniton, String cordinateNameDeliveredByMethodToString ) {
    
    	Coordinate coordinate = new CoordinateImpl( coordinateDefiniton );
    	
        assertThat( coordinate.toString( ) )
                  .as( String.format( "name parameter in constructor '%s' should be name delivered by toString() method", coordinateDefiniton  ) )
                  .isEqualTo( cordinateNameDeliveredByMethodToString );
    }
}
