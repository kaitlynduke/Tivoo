import java.io.IOException;
import java.util.ArrayList;

import org.jdom.JDOMException;

/*
 * Parser is an abstract super class for all subclass Parsers for individual .xml files
 */
public abstract class Parser {
	public abstract boolean isThisKind();
	
	public abstract ArrayList<CalendarEvent> parse() throws JDOMException, IOException;
}
