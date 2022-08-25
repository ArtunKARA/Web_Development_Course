var name = prompt("What is your message?");
alert("Your message "+ name.length + " you have " + (140-name.length) + "characther left");
name.slice(0,140);
