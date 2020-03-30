import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-countdown-timer-get-set',
  templateUrl: './countdown-timer-get-set.component.html',
  styleUrls: ['./countdown-timer-get-set.component.css']
})
export class CountdownTimerGetSetComponent {

  private _seconds = 11; 
  @Input() 
  get seconds(): number { 
    return this._seconds; 
  } 
  set seconds(v) { 
    v = typeof v === 'undefined' ? 11 : v; 
    const vFixed = Number(v); 
    this._seconds = Number.isNaN(vFixed) ? 11 : vFixed; 
  }


  constructor() { }

  ngOnInit() {
  }

}
