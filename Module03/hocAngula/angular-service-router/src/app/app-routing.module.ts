import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryPageComponent } from './dictionary-page/dictionary-page.component';
import { DictionaryDetailComponent } from './dictionary-detail/dictionary-detail.component';
import { AuthGuard } from './auth.guard';
import { LoginStep1Component } from './login-step1/login-step1.component';
import { LoginStep2Component } from './login-step2/login-step2.component'
import { from } from 'rxjs';


const routes: Routes = [
  { path: 'dictionary', component: DictionaryPageComponent,
  children: [ 
    { path: ':key', component: DictionaryDetailComponent,
    canActivate: [AuthGuard] } ]
},
{
  path: 'login-step-1', component: LoginStep1Component },
{ path: 'login-step-2', component: LoginStep2Component }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
