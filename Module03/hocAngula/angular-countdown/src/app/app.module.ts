import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountdownTimeComponent } from './countdown-time/countdown-time.component';
import { CountdownTimeSetGetComponent } from './countdown-time-set-get/countdown-time-set-get.component';
import { CountdownTimerOnchangesComponent } from './countdown-timer-onchanges/countdown-timer-onchanges.component';

@NgModule({
  declarations: [
    AppComponent,
    CountdownTimeComponent,
    CountdownTimeSetGetComponent,
    CountdownTimerOnchangesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
