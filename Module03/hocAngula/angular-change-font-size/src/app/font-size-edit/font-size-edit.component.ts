import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-font-size-edit',
  templateUrl: './font-size-edit.component.html',
  styleUrls: ['./font-size-edit.component.css']
})
export class FontSizeEditComponent implements OnInit {

  fontSize = 24;

  onChange(value) {
    this.fontSize = value;
  }

  constructor() { }

  ngOnInit() {
  }

}
