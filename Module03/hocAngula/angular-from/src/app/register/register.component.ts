import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators,FormControl, AbstractControl } from '@angular/forms';

function comparePassword(c:AbstractControl) {

  const v = c.value;
  return (v.password === v.confirmPassword)? null : {
    passwordnotmatch:true
  };
  
}


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup; 

  onSubmit(){
   console.log(this.registerForm);
  }

  constructor(private fb: FormBuilder) { }

  ngOnInit(){
    this.registerForm = this.fb.group({ 
      email: ['', [Validators.required, Validators.email]],
      pwGroup: this.fb.group({
        password: ['', Validators.required], 
        confirmPassword: ['', Validators.required]
      },{Validators:comparePassword}) 
    });
  }
  
}
