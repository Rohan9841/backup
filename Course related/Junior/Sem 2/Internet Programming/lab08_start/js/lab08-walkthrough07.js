
/* add code here */
var daysOfWeek = new Array("Mon","Tues","Wed","Thur","Fri");
daysOfWeek.push("Sat");
daysOfWeek.unshift("Sun");
//document.write(daysOfWeek + "<br/>");

document.write("<table border = 1>");
document.write("<tr>");
for(var i = 0; i <daysOfWeek.length; i++)
{
    if(daysOfWeek[i].length < 4)
    {
        day = daysOfWeek[i];
    }
    else
    {
        day = "<em>" + daysOfWeek[i] + "</em>";
    }
    document.write("<th>" + day + "</th>");
}
document.write("</tr>");

var counter = 1;

for(var i = 0; i<=4; i++)
{
    document.write("<tr>");
    for(var j = 0; j<daysOfWeek.length; j++)
    {
        if(counter <= 30)
        {
            document.write("<td>"+counter+"</td>");
            counter++;
        }
    }
    document.write("</tr>");
}
document.write("</table>");
