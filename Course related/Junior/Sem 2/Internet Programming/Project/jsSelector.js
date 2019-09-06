

// This loads JS files in the head element
function loadJS(url) {
    // adding the script tag to the head
    var head = document.getElementsByTagName('head')[0];
    var script = document.createElement('script');
    script.type = 'text/javascript';
    script.src = url;

    // fire the loading
    head.appendChild(script);
}

enquire.register("screen and (max-width: 480px)", {
    match: function () {
        // Load a JS file
        loadJS('mobile.js');
    }
});


enquire.register("screen and (min-width: 481px) and (max-width: 768px)", {
    match: function () {
        loadJS('tablet.js');
        //console.log('tablet loaded');
    }
});


enquire.register("screen and (min-width: 769px)", {
    match: function () {
        loadJS('desktop.js');
        //console.log('desktop loaded');
    }
});
