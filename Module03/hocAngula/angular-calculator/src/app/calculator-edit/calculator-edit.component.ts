import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator-edit',
  templateUrl: './calculator-edit.component.html',
  styleUrls: ['./calculator-edit.component.css']
})
export class CalculatorEditComponent implements OnInit {

  output: number;
  first: number;
  second: number;
  operator = '+';

  onFirstChange(value) {
    this.first = Number(value);
  }

  onSecondChange(value) {
    this.second = Number(value);
  }

  onSelectChange(value) {
    this.operator = value;
  }

  calculate() {
    switch (this.operator) {
      case '+':
        this.output = this.first + this.second;
        break;
      case '-':
        this.output = this.first - this.second;
        break;
      case '*':
        this.output = this.first * this.second;
        break;
      case '/':
        this.output = this.first / this.second;
        break;
    }
  }
  constructor() { }

  ngOnInit() {
  }

}
