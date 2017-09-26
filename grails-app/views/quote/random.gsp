<!DOCTYPE html>
<html>
<head>
	<title> Random Quote </title>
  <asset:javascript src="jquery-2.2.0.min.js"></asset:javascript>
  <r:layoutResources/>
</head>
<body>
  <ul id="menu">
    <li>
      <g:link action="ajaxRandom" update="quote"> Next Quote </g:link>
    </li>
    <li>
      <g:link action="index"> Admin </g:link>
    </li>
  </ul>
	<div>
		<h1> ${sizeT} </h1>
		<q> ${quote.content}</q>
		<p> ${quote.author}</p>
	</div>
</body>
</html>