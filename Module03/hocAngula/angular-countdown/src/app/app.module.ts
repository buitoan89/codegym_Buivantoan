import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountdownTimeComponent } from './countdown-time/countdown-time.component';
import { CountdownTimeSetGetComponent } from './countdown-time-set-get/countdown-time-set-get.component';
import { CountdownTimerOnchangesComponent } from './countdown-timer-onchanges/countdown-timer-onchanges.component';
import { AngularCountdownTimerAliasComponent } from './angular-countdown-timer-alias/angular-countdown-timer-alias.component';
import { CountdownTimerEventComponent } from './countdown-timer-event/countdown-timer-event.component';
import { AngularCountdownTimerEventAliasComponent } from './angular-countdown-timer-event-alias/angular-countdown-timer-event-alias.component';

@NgModule({
  declarations: [
    AppComponent,
    CountdownTimeComponent,
    CountdownTimeSetGetComponent,
    CountdownTimerOnchangesComponent,
    AngularCountdownTimerAliasComponent,
    CountdownTimerEventComponent,
    AngularCountdownTimerEventAliasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
