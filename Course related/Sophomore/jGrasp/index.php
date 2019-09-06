<!DOCTYPE html>

<html>

    <head>
    
        <title>Ajax try</title>
        
        <script src = "jquery.js"></script>
    
    </head>

    <body>
        
        <div id = "emptyPara"></div>
        <script type = "text/javascript">
        
        $.ajax("Alatin.txt")
                .done(function(data){
            
                var lines = data.responseText.split("\n");
                
                for (var i = 0; i<lines.length; i++)
                    {
                        $("#emptyPara").html(data);
                    }
                
            })
                .fail(function(){
                
                alert("There was a problem.")
                
            })

            
            
        
        </script>
        
    </body>

</html>