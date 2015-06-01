define("xtext/asttr-syntax", ["orion/editor/stylers/lib/syntax"], function(mLib) {
	var keywords = [
		"abstract", "adapt", "boolean", "enum", "extends", "from", "int", "string", "type"
	];

	var grammars = [];
	grammars.push.apply(grammars, mLib.grammars);
	grammars.push({
		id: "xtext.asttr",
		contentTypes: ["xtext/asttr"],
		patterns: [
			{include: "orion.lib#string_doubleQuote"},
			{include: "orion.lib#string_singleQuote"},
			{include: "orion.c-like#comment_singleLine"},
			{include: "orion.c-like#comment_block"},
			{include: "orion.lib#number_decimal"},
			{include: "orion.lib#brace_open"},
			{include: "orion.lib#brace_close"},
			{
				match: "\\b(?:" + keywords.join("|") + ")\\b",
				name: "keyword.operator.asttr"
			}
		]
	});

	return {
		id: "xtext.asttr",
		grammars: grammars,
		keywords: keywords
	};
});
