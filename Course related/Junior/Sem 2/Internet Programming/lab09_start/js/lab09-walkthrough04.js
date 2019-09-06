/* code goes here */

// function simpleHandler(event) 
// {
//     alert("button was clicked");
// }
// function simpleHandler(event) 
// {
//     var content = document.getElementById("content");
//     if(btn.innerHTML == "Hide"){
//         content.style.display = "none";
//         btn.innerHTML = "Show";
//     }
//     else{
//         content.style.display = "block";
//         btn.innerHTML = "Hide";
//     }
// }

var btn = document.getElementById("testButton");
btn.addEventListener("click", simpleHandler);

var img = document.getElementById("mainImage");
img.addEventListener("mouseover", function(event)
{
    img.className = "makeItGray";
});

img.addEventListener("mouseout", function(event){
    img.className = "makeItNormal";
});

function simpleHandler(event)
{
    var content = document.getElementById("content");
    if(btn.innerHTML == "Hide"){
        btn.innerHTML = "Show";
        content.className = "makeItDisappear";
        setTimeout(function(){
            content.style.display = "none";
        },1000);
    }
    else{
        btn.innerHTML = "Hide";
        content.style.display = "block";

        setTimeout(function(){
            content.className = "makeItNormal";
        },500);
    }
}

