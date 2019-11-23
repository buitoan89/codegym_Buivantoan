function custom() {
    var txt;
    var pay;
    var name = prompt("Enter name customer","");
        id_name = prompt("Enter id cart customer","");
        birth = prompt("Enter Birthday (dd/mm/yy)","");
        email = prompt("Enter email customer","");
        adress = prompt("Enter adress customer","");
        typecus = prompt("Enter type customer","");
        discuont = prompt("Enter discuont ","");
        accompanying = prompt("Enter number of accompanying","");
        typeroom = prompt("type room","");
        rentday = prompt("Enter rent day","");
        typeservice = prompt("Enter type service","");
        pay = typeservice*rentday*(1- discuont/100 );
        txt = name +"\n"+ id_name +"\n"+ birth +"\n"+ email+"\n"+adress+"\n"+typecus+"\n"+
            discuont+"\n"+ accompanying+"\n"+typeroom+"\n"+rentday+"\n"+typeservice+"\n"+pay;
        alert(txt);
        // alert(id_name);
        // alert(birth);
        // alert(email);
        // alert(adress);
        // alert(typecus);
        // alert(discuont);
        // alert(accompanying);
        // alert(typeroom);
        // alert(rentday);
        // alert(typeservice);

        //     if (id_name == null || id_name == ""){
        //         id_name = prompt("please Enter id cart customer","");
        //     } else {
        //         if (email == null || email == ""){
        //             email = prompt("please Enter email customer","");
        //         } else{
        //             txt = id_name + birth + email;
        //         }
        //     }




}