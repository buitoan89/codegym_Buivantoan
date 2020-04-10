import { Component, OnInit, NgModule } from '@angular/core';
import { FormControl, Validators, ReactiveFormsModule } from '@angular/forms';
import { LoginServiceService } from '../login-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-step1',
  templateUrl: './login-step1.component.html',
  styleUrls: ['./login-step1.component.scss']
})
export class LoginStep1Component implements OnInit {

  username = new FormControl(); 

  constructor(
    private router: Router, 
    private loginSrv: LoginServiceService
  ) { }

  nextStep() { 
    this.loginSrv.loginData.username = this.username.value; 
    this.router.navigateByUrl('/login-step-2'); }


  ngOnInit() {
  }

}
