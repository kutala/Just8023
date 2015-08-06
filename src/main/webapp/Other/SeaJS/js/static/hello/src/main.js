define(['static/hello/src/a'],function(require, exports) {
	var a = require("static/hello/src/a");
	exports.say = a.a;
	exports.fnc = function(){alert("fnc");};
});