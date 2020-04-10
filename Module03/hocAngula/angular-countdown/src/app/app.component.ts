import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-countdown';

  countdownMsg = ''; 
  finishCountdown() { this.countdownMsg = 'Finished!'; }

  countdownAliasMsg = ''; endCountdown() { this.countdownAliasMsg = 'Ended!'; }

}

