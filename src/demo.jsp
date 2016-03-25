<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title></title>
<style>
div {
	width: 200px;
	height: 200px;
	font-size: 16px;
	margin: 0;
	padding: 0;
	border: 0;
}

#container {
	border: 2px solid black;
	width: 610px;
	height: 610px;
	margin: auto;
	position: relative;
}

#one {
	background: red;
}

#two {
	background: green;
	position: absolute;
	left: 210px;
	top: 100px;
}

#three {
	background: blue;
}
</style>
</head>
<body>
	<div id="container">
		<div id="one">这是div1块</div>
		<div id="two">这是div2块</div>
		<div id="three">这是div3块</div>
	</div>
</body>
</html>