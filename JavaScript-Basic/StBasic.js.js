var name = "Artun";
name.toUpperCase(name);
name.toLowerCase(name);

var name = prompt("What is your name?");
alert("Hello " + name.slice(0,1).toUpperCase()+name.slice(1,name.length).toLowerCase());
