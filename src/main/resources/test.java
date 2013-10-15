import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

public class test {
    public static void main (String[] args){
     try{
            // remove data:image/png;base64, and then take rest sting
            String img64 = "64 base image data here";
        byte[] decodedBytes = DatatypeConverter.parseBase64Binary(img64 );
        BufferedImage bfi = ImageIO.read(new ByteArrayInputStream(decodedBytes));    
        File outputfile = new File("saved.png");
        ImageIO.write(bfi , "png", outputfile);
        bfi.flush();
     }catch(Exception e)
         {  
          //Implement exception code    
     }

    }
}
$.ajax( {    
    url:'/rest/draw/saveImage',// 跳转到 action    
data:JSON.stringify(canvas),    
type:'post',    
dataType: 'json',
contentType: 'application/upload',
cache: false,
success:function(data) {    
if(data.msg =="true" ){    
   // view("修改成功！");    
   alert("修改成功！");    
   window.location.reload();    
}else{    
   view(data.msg);    
}    
},    
error : function() {    
 // view("异常！");    
 alert("异常！");    
}    
}); 