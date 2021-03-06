require(['jquery', '/demo-app/router/doc/resources/js/left-panel.js'], function(jQuery, tocTreePromise) { 
	
	// Set padding to 0 in panel body.
	jQuery("#docAppPanel > div.panel-body").css("padding", "0px");
	
	var body = jQuery("body");
	var docContent = jQuery('#doc-content');	
	var toc = jQuery('#toc');
	var oldBottom = -1;
	
	function resizeHandler() {
		// Markdown width
		jQuery("div#doc-content .markdown-body").each(function() {
			var delta = jQuery("#docAppPanel")[0].getBoundingClientRect().right - this.getBoundingClientRect().right - 30;
			if (Math.abs(delta)>5) {
				var jThis = jQuery(this);
				jThis.css("max-width", jThis.width()+delta+"px");
			}
		});
		
		// Height
		var delta = window.innerHeight - body.height();
		delta-=5; // offset - app panel margin
		if (delta!=0) {
			docContent.height(docContent.height()+delta);
			docContent.css("overflow-y", "scroll");
		}
		
		var docContentBottom = docContent[0].getBoundingClientRect().bottom;
		if (docContentBottom!=oldBottom) {
			oldBottom = docContentBottom;
			var tocRect = toc[0].getBoundingClientRect();
			var tocHeight = docContentBottom - tocRect.top - 1;
			toc.height(tocHeight);
			
			// Scrolling current selection into view
			tocTreePromise.then(function(tocTree) {
				var selected = tocTree.jstree("get_top_selected");
				if (selected.length>0) {
					var nodeElement = jQuery('#'+selected[0]+"_anchor");
					var nodeOffsetTop = nodeElement[0].offsetTop;
					var tocScrollTop = toc.scrollTop() + toc[0].offsetTop;
					var nodeOffsetBottom = nodeOffsetTop + nodeElement.height();
					var tocScrollBottom = tocScrollTop+toc.height();
					if (nodeOffsetTop < tocScrollTop || nodeOffsetBottom > tocScrollBottom) {			
						var targetScrollTop = nodeOffsetTop - toc.height()/2;
						toc.animate({ scrollTop: targetScrollTop+"px" });
					}												
				}
			})
		}
		
	}
	
	jQuery(window).resize(resizeHandler);
	
	setInterval(resizeHandler, 100);
});