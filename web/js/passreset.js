/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validatec() {



    if (document.myform.password.value != document.myform.password2.value) {
        document.getElementById('passerror').innerHTML = '';
        document.myform.password.focus();
         document.getElementById('passerror').innerHTML = 'Password do not match . Try again';
        return false;
    }
  
    return(true);
}


