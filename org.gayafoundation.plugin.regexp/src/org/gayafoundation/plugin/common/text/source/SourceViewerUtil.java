package org.gayafoundation.plugin.common.text.source;

import org.eclipse.jface.text.CursorLinePainter;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.swt.graphics.Color;
import org.gayafoundation.plugin.common.resource.ColorResource;
import org.gayafoundation.plugin.common.resource.FontResource;

public class SourceViewerUtil {

	public static IVerticalRuler createDefaultRuler() {
		CompositeRuler ruler = new CompositeRuler();
		LineNumberRulerColumn rulerColumn = new LineNumberRulerColumn();
		rulerColumn.setFont(FontResource.getDefaultFont());
		rulerColumn.setForeground(ColorResource.getColor(120, 120, 120));
		ruler.addDecorator(0, rulerColumn);
		return ruler;
	}
	
	public static CursorLinePainter createDefaultCursorLinePainter(ITextViewer textViewer) {
		CursorLinePainter cursorLinePainter = new CursorLinePainter(textViewer);
		Color highlightColor = ColorResource.getColor(232, 242, 254); // 
		cursorLinePainter.setHighlightColor(highlightColor);
		return cursorLinePainter;
	}
}
